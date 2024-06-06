package com.example.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJDBC.model.Student;
import com.example.SpringJDBC.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
	private StudentRepository repo;
	
	public void addStudent(Student s) {
		repo.save(s);
	}

	public List<Student> getStudents() {
	
		return repo.findAll();
	}
}
