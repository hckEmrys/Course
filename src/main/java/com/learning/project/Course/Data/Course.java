package com.learning.project.Course.Data;

public class Course {
	
	int courseId;
	String courseName;
	String lecturer;
	public Course(int courseId, String courseName, String lecturer) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.lecturer = lecturer;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", lecturer=" + lecturer + "]";
	}

	
	public Course()
	{
		
	}
	
}
