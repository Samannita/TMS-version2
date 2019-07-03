package com.cg.trainingmanagementystem.utility;

import java.util.Set;

import com.cg.trainingmanagementystem.exception.InvalidFormatInput;
import com.cg.trainingmanagementystem.service.bean.Course;

public class UserInputValidator {
	
	public static boolean courseIdValidLength(String courseId) throws  InvalidFormatInput {
		
		if (!courseId.matches("CO_[0-9]{4}")) {
			throw new InvalidFormatInput("Invalid format of input for Course! \n You must use CD_1001 format");
		}
		return true;
	
		
	}
	

	public static boolean courseNameValid(String courseName) throws  InvalidFormatInput {
	
			boolean flag = false;
			if (!courseName.matches("[A-Za-z\\s]{4,}")) {
				throw new InvalidFormatInput(
						"Invalid format Name! \n Your name cannot contain special character or digits");
			}
			return true;
		}
		
	
	public static boolean courseIdNotEmpty(String courseId) throws  InvalidFormatInput {
			
			if(courseId==null ) {
				 throw new InvalidFormatInput("Course id cant be null");
			}
			return true;
		}
		
	
	
public static boolean courseNameNotEmpty(String courseName) throws  InvalidFormatInput {
	
	if(courseName==null ) {
		 throw new InvalidFormatInput("Course name cant be null");
	}
	return true;
}






}






