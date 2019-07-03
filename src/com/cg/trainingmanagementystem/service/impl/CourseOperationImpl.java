package com.cg.trainingmanagementystem.service.impl;

import com.cg.trainingmanagementystem.ui.*;

import com.cg.trainingmanagementsystem.dao.impl.CourseOperationDaoImpl;
import com.cg.trainingmanagementsystem.dao.impl.DataBaseEntry;
import com.cg.trainingmanagementsystem.dao.impl.GetCourseDetailImpl;
import com.cg.trainingmanagementsystem.dao.impl.ICrudOperation;
import com.cg.trainingmanagementsystem.dao.impl.IGetAll;

import com.cg.trainingmanagementystem.utility.*;

import java.sql.SQLException;
import java.util.*;

import com.cg.trainingmanagementystem.exception.Programexception;

import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bean.Course;

public class CourseOperationImpl extends UserInputValidator implements ICourseOperation {

	// this service method will call the create() of CourseOerationDaoImpl to add
	// the course

	@Override
	public boolean addCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws Programexception, SQLException {

		boolean flag = false;

		ICrudOperation<Course> iCrudOperation = new CourseOperationDaoImpl();
		flag = iCrudOperation.create(course);

		return flag;

	}

	// this service method will call the delete() of CourseOerationDaoImpl to delete
	// the course

	@Override
	public boolean deleteCourse(String courseId) throws SQLException, Programexception {

		boolean flag = false;

		ICrudOperation<Course> iCrudOperation = new CourseOperationDaoImpl();
		flag = iCrudOperation.delete(courseId);

		return flag;

	}

	// this service method will call the retrieveAll() of CourseOerationDaoImpl to
	// fetch all the course available in the database

	@Override
	public Set<Course> getAllCourse() throws SQLException {
		ICrudOperation<Course> iCrudOperation = new CourseOperationDaoImpl();
		HashSet<Course> courses = iCrudOperation.retrieveAll();
		return courses;

	}

	// this service method will call the retrieveCourse() of CourseOerationDaoImpl
	// to fetch a particular course details through courseId

	@Override
	public Course retrieveCourse(String courseId) throws SQLException, Programexception {

		ICrudOperation<Course> crudOperation = new CourseOperationDaoImpl();

		Course courses = crudOperation.retrieveCourse(courseId);

		return courses;

	}

}
