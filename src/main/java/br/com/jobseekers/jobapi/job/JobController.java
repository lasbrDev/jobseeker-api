package br.com.jobseekers.jobapi.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private List<Job> jobs = new ArrayList<>();

    @GetMapping
    public List<Job> findAll() {
        return jobs;
    }

    @PostMapping
    public String createJob(@RequestBody Job job) {
        jobs.add(job);
        return "Job added successfully";
    }
}
