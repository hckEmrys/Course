package com.learning.project.Course.API;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.project.Course.Data.Course;
import com.learning.project.Course.Data.Student;
import com.learning.project.Course.dao.CourseJdbcDAO;

@RestController
@RequestMapping("/rest/v2")
public class CourseController {
	
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseJdbcDAO courseJdbcDAO;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses()
	{
		return courseJdbcDAO.getAllCourses();
	}

	
	@GetMapping("/students")
	public List<Student> getAllStudentsForACourse()
	{
		return courseJdbcDAO.getAllStudentsForCourse(100);
	}
	
	
	// make a post mapping which passes a JSON of 
	@RequestMapping("/save/course")
	public void saveCourse(@RequestBody Course course)
	{
		courseJdbcDAO.saveCourse(course);
	}
	
}
