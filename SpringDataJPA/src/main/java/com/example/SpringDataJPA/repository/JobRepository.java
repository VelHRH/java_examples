package com.example.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringDataJPA.model.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {}
