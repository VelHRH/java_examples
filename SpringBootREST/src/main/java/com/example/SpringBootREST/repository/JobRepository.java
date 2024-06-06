package com.example.SpringBootREST.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SpringBootREST.model.Job;

@Repository
public class JobRepository {
    List<Job> jobs = new ArrayList<Job>();

    public JobRepository() {

		// Java Developer Job Post
		jobs.add(new Job(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
				List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

		// Frontend Developer Job Post
		jobs.add(
				new Job(2, "Frontend Developer", "Experience in building responsive web applications using React",
						3, List.of("HTML", "CSS", "JavaScript", "React")));

		// Data Scientist Job Post
		jobs.add(new Job(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
				List.of("Python", "Machine Learning", "Data Analysis")));

		// Network Engineer Job Post
		jobs.add(new Job(4, "Network Engineer",
				"Design and implement computer networks for efficient data communication", 5,
				List.of("Networking", "Cisco", "Routing", "Switching")));

		// Mobile App Developer Job Post
		jobs
				.add(new Job(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
						3, List.of("iOS Development", "Android Development", "Mobile App")));

    }

    public List<Job> list() {
		return jobs;
	}

	public void add(Job job) {
		jobs.add(job);

	}
}
