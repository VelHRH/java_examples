package com.example.SpringDataJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDataJPA.model.Job;
import com.example.SpringDataJPA.repository.JobRepository;

@Service
public class JobService {
    @Autowired
    public JobRepository repo;

    public List<Job> getAll() {
		return repo.findAll();		
	}

    public Job add(Job job) {
        return repo.save(job);
    }
}
