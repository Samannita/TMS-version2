package com.cg.trainingmanagementystem.utility;

public class Queries {

	public static final String Course_Details = "Select courseId,courseName,courseDesc,course_Charges from course";
	public static final String Course_Details_Through_CourseId = "select courseId,courseName,courseDesc,course_Charges from course where courseId=?";
	public static final String Delete_Course = "Delete from course where courseId=?";
	public static final String Add_Course = "Insert into course values(?,?,?,?)";
	public static final String Update_course = "Update course SET course_charges = ? where courseId= ?";

}
