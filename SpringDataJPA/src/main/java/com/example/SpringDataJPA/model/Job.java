package com.example.SpringDataJPA.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
    @Id
    private int id;
	private String profile; 
	private String description;
	private Integer reqExperience;
    private List<String> techStack;

    public Job() {
    }
    
    public Job(int id, String profile, String description, Integer reqExperience, List<String> techStack) {
        this.id = id;
        this.profile = profile;
        this.description = description;
        this.reqExperience = reqExperience;
        this.techStack = techStack;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProfile() {
        return this.profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getReqExperience() {
        return this.reqExperience;
    }
    public void setReqExperience(Integer reqExperience) {
        this.reqExperience = reqExperience;
    }
    public List<String> getTechStack() {
        return techStack;
    }
    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }
}
