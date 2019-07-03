package com.cg.trainingmanagementystem.service;

import java.sql.SQLException;

import java.util.*;


import com.cg.trainingmanagementystem.exception.Programexception;

import com.cg.trainingmanagementystem.service.bean.Course;

public interface ICourseOperation {

	public Set<Course> getAllCourse() throws SQLException;

	boolean deleteCourse(String courseId) throws SQLException, Programexception;

	boolean addCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws Programexception, SQLException;

	public Course retrieveCourse(String courseId) throws SQLException, Programexception;

}