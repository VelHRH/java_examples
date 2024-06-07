package com.example.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurity.model.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {}
