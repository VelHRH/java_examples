package com.example.SpringBootMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.SpringBootMVC.model.Job;
import com.example.SpringBootMVC.service.JobService;


@Controller
public class JobController {

	@Autowired
	JobService service;

	@GetMapping({"/","/home"})
	public String home() {
		return "home";
	}

    @GetMapping("/viewalljobs")
	public String viewalljobs(Model model) {
        List<Job> jobs = service.getAll();
        model.addAttribute("jobPosts", jobs);
		return "viewalljobs";
	}
}
