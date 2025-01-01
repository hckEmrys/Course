package com.learning.project.Course.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcDAO {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

}
