package com.cg.trainingmanagementystem.utility;

import java.util.Set;

import com.cg.trainingmanagementystem.exception.CourseNameNullException;
import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.InvalidCourseNameException;
import com.cg.trainingmanagementystem.service.bin.Course;

public class UserInputValidator {
	
	public static String courseIdValidLength(String courseId) {
		
		try {
			if((courseId.matches("[CD][_][0-9]{3}"))) {
				return courseId;
			}	
			else {
				throw new InvalidCourseIdException("Invalid CourseId");	
		}
		}
		catch(InvalidCourseIdException e) {
			e.getMessage();
		}
		return courseId;
		
	
		
	}
	

	public static String courseNameValid(String courseName) {
		boolean flag=false;
		try {
			String regex="[A-Za-z]{1,30}";
			if((courseName.matches(regex))) {
				return courseName;
			}
			else {
				throw new InvalidCourseNameException();
		}
		}
			catch(InvalidCourseNameException e) {
				e.getMessage();
			}
		return courseName ;
		
	}
	public static String courseIdNotEmpty(String courseId) {
		
		try {
			if(courseId!=null ) {
				return courseId;
			}
			else {
				throw new CourseNullException();
		}
		}
		
		catch(CourseNullException e) {
			e.getMessage();
		}
		return courseId;
	}
	
public static String courseNameNotEmpty(String courseName) throws CourseNameNullException{
	try {
		if(courseName!=null ) {
			return courseName;
		}
		else {
			throw new CourseNullException();
	}
	}
	
	catch(CourseNullException e) {
		e.getMessage();
	}
	return courseName;
}


public boolean deleteCourse(Set<Course> course) throws InvalidCourseIdException, InvalidCourseNameException {
	// TODO Auto-generated method stub
	return false;
}






}