package com.cg.trainingmanagementsystem.dao.impl;

import java.sql.SQLException;

import java.util.*;


import com.cg.trainingmanagementystem.exception.Programexception;

import com.cg.trainingmanagementystem.service.bean.Course;

/**
 * 
 */
public interface ICrudOperation<T> {

	/**
	 * @throws CourseNullException
	 * @throws SQLException
	 * @throws courseIdNotFoundException
	 * @throws Programexception
	 * 
	 */
	public boolean create(Course course) throws SQLException, Programexception;

	/**
	 * @throws InvalidCourseIdException
	 * @throws SQLException
	 * 
	 */

	public boolean delete(String courseId) throws SQLException, Programexception;

	/**
	 * @throws SQLException
	 * 
	 */
	public HashSet<T> retrieveAll() throws SQLException;

	public Course retrieveCourse(String courseId) throws SQLException, Programexception;

}