package com.example.SpringBootMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootMVC.repository.JobRepository;
import com.example.SpringBootMVC.model.Job;

@Service
public class JobService {

    @Autowired
    public JobRepository repo;

    public List<Job> getAll() {
		return repo.list();		
	}
}
