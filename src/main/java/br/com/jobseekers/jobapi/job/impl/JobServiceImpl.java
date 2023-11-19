package br.com.jobseekers.jobapi.job.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.jobseekers.jobapi.job.Job;
import br.com.jobseekers.jobapi.job.JobRepository;
import br.com.jobseekers.jobapi.job.JobService;


@Service
public class JobServiceImpl implements JobService {

    JobRepository jobRepository;
    private Long nextId = 1L;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    //private List<Job> jobs = new ArrayList<>();


    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobRepository.save(job);
    }

    @Override
    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {
        try {
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> jOptional = jobRepository.findById(id);
        if (jOptional.isPresent()) {
            Job job = jOptional.get();
                job.setTitle(updatedJob.getTitle());
                job.setDescription(updatedJob.getDescription());
                job.setMinSalary(updatedJob.getMinSalary());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setLocation(updatedJob.getLocation());
                return true;
        }
        return false;
    }
}
