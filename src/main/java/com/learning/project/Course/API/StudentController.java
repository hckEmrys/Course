package com.learning.project.Course.API;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.project.Course.Data.Student;

@RestController
@RequestMapping("/rest/v2")
public class StudentController {

	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/save/student")
	public void saveStudentCourseDetails(@RequestBody Student student
			,@RequestParam(name="courseID") String courseID)
	{
		
		log.info(student.toString());
	}
	
	
}
