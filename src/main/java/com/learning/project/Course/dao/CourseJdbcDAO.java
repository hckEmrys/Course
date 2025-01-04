package com.learning.project.Course.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learning.project.Course.Data.Course;
import com.learning.project.Course.Data.Student;

@Repository
public class CourseJdbcDAO {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public List<Course> getAllCourses()
	{
		return jdbcTemplate.query("Select * from course", new BeanPropertyRowMapper<>(Course.class));
	}
	
	
	// get all students taking the course
	
	public List<Student> getAllStudentsForCourse(int courseID)
	{
	
		return jdbcTemplate
				.query("Select * from Student s join course_student sc on s.id=sc.id where sc.courseID=?",new Object[] {courseID} 
				,new BeanPropertyRowMapper<>(Student.class));
	}
	
	public void saveCourse(Course course)
	{
		String updateQuery = "MERGE into Course(courseId,courseName,lecturer)"
		+ " values "
		+ "(?,?,?)";
		
		jdbcTemplate.update(updateQuery,
				course.getCourseId(),
				course.getCourseName(),
				course.getLecturer()
				);
	}
	
	
	
	

}
