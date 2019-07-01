package com.cg.trainingmanagementsystem.dao.impl;
import java.sql.SQLException;
import java.util.*;

import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.courseIdNotFoundException;
import com.cg.trainingmanagementystem.service.bin.Course;

/**
 * 
 */
public interface ICrudOperation<T> {

	/**
	 * @throws CourseNullException 
	 * @throws SQLException 
	 * 
	 */
	public boolean create(Course course) throws CourseNullException, SQLException;

	/**
	 * @throws InvalidCourseIdException 
	 * @throws SQLException 
	 * 
	 */
	public boolean update(Course course) throws InvalidCourseIdException, SQLException;

	/**
	 * @throws SQLException 
	 * @throws courseIdNotFoundException 
	 * 
	 */
	//public HashSet<Course> retrieve(Set<Course> courseId) throws SQLException, courseIdNotFoundException;

	/**
	 * @throws InvalidCourseIdException 
	 * @throws SQLException 
	 * @throws courseIdNotFoundException 
	 * 
	 */
	public boolean delete(Course course) throws InvalidCourseIdException, SQLException, courseIdNotFoundException;

	/**
	 * @throws SQLException 
	 * 
	 */
	public HashSet<T> retrieveAll() throws SQLException;
	

	Course retrieveCourse(String courseId) throws SQLException, courseIdNotFoundException;

	

}