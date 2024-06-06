package com.example.SpringBootREST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootREST.repository.JobRepository;
import com.example.SpringBootREST.model.Job;

@Service
public class JobService {

    @Autowired
    public JobRepository repo;

    public List<Job> getAll() {
		return repo.list();		
	}
}
