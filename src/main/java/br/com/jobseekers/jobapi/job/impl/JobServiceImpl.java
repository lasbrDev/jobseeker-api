package br.com.jobseekers.jobapi.job.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jobseekers.jobapi.job.Job;
import br.com.jobseekers.jobapi.job.JobService;


@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobs = new ArrayList<>();

    @Override
    public List<Job> findAll() {
    
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        jobs.add(job);
    }
}
