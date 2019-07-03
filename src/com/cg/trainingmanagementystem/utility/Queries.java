package com.cg.trainingmanagementystem.utility;

public class Queries {

	public static final String COURSE_DETAILS = "Select courseId,courseName,courseDesc,course_Charges from course";
	public static final String COURSE_DETAILS_THROUGH_COURSEID = "select courseId,courseName,courseDesc,course_Charges from course where courseId=?";
	public static final String DELETE_COURSE = "Delete from course where courseId=?";
	public static final String ADD_COURSE = "insert into course(courseId,courseName,courseDesc,course_charges) values(?,?,?,?)";
	
}
