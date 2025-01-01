package com.learning.project.Course.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	@GetMapping("/courses")
	public String getAllCourses()
	{
		return "Simple";
	}

}
