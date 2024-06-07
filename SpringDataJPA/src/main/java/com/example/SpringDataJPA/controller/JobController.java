package com.example.SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDataJPA.model.Job;
import com.example.SpringDataJPA.service.JobService;


@RestController
public class JobController {

	@Autowired
	JobService service;

    @GetMapping("jobPost")
	public List<Job> getAllJobs() {
		return service.getAll();
	}

	@PostMapping("jobPost")
	public Job addJob(@RequestBody Job job) {
		return service.add(job);
	}
}