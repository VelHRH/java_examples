package com.example.SpringJDBC.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.SpringJDBC.model.Student;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbc;

    public void save(Student s) {
		String sql="insert into student(id, name, marks) values(?,?,?)";
	    int rows=jdbc.update(sql, s.getId(), s.getName(), s.getMarks());
	    System.out.println(rows + " affected");
	}

    public List<Student> findAll() {
		String sql = "select * from student"; 
        RowMapper<Student> mapper=(rs, rowNum) -> {
		    Student s=new Student();
			s.setId(rs.getInt("id"));
		    s.setName(rs.getString("name"));
		    s.setMarks(rs.getInt("marks"));
		    return s; 
		}; 
		  
		return jdbc.query(sql, mapper); 
	}
}
