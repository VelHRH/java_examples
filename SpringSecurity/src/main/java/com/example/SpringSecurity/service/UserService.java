package com.example.SpringSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringSecurity.model.User;
import com.example.SpringSecurity.repository.UserRepository;

@Service
public class UserService {
    @Autowired
	private UserRepository repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
	    return repo.save(user) ;
	}
}
