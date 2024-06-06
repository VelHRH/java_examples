package com.example.SpringBootREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootREST.model.Job;
import com.example.SpringBootREST.service.JobService;


@RestController
public class JobController {

	@Autowired
	JobService jobService;

    @GetMapping("jobPosts")
	public List<Job> getAllJobs() {
		return jobService.getAll();
	}
}
