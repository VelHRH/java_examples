package com.example.SpringSecurity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurity.model.Job;
import com.example.SpringSecurity.service.JobService;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
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

	@PutMapping("jobPost")
	public Job updateJob(@RequestBody Job job) {
		return service.update(job);
	}

	@DeleteMapping("jobPost/{id}")
	public String deleteJob(@PathVariable int id) {
		return service.deleteById(id);
	}

	@GetMapping("jobPost/{id}")
	public Optional<Job> getJob(@PathVariable int id) {
		return service.getById(id);
	}
}