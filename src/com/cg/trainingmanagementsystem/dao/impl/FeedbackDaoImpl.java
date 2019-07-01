package com.cg.trainingmanagementsystem.dao.impl;
import java.util.*;

import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.InvalidCourseNameException;
import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bin.Course;
import com.cg.trainingmanagementystem.service.bin.Feedback;

/**
 * 
 */
public abstract class FeedbackDaoImpl implements ICourseOperation {

	
	public boolean create(Feedback o) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean update(Feedback o) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Feedback retrieve(Feedback o) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(Feedback o) {
		// TODO Auto-generated method stub
		return false;
	}

	public HashSet<Feedback> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public boolean create(Course course) throws CourseNullException {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean update(Course course) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean delete(Course course) throws InvalidCourseIdException {
//		// TODO Auto-generated method stub
//		return false;
//	}


//	@Override
//	public boolean addCourse(Course course) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//	@Override
//	public boolean deleteCourse(Course course) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//	@Override
//	public boolean modifyCourse(Course course) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//	@Override
//	public Set<Course> getAllCourse() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public Course getCourseDetails() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public boolean deleteCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
//			throws InvalidCourseIdException, InvalidCourseNameException {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//	@Override
//	public boolean addCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
//			throws InvalidCourseIdException, InvalidCourseNameException {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//	@Override
//	public boolean modifyCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
//			throws InvalidCourseIdException, InvalidCourseNameException {
//		// TODO Auto-generated method stub
//		return false;
//	}

}