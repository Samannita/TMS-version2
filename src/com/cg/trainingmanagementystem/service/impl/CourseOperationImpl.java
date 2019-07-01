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

import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.InvalidCourseNameException;
import com.cg.trainingmanagementystem.exception.courseIdNotFoundException;
import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bin.Course;

//import com.cg.trainingmanagementystem.services.CoordinatorService;
public class CourseOperationImpl extends UserInputValidator implements ICourseOperation {

	@Override
	public boolean addCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException {
		if (DataExistenceCheck.DataExistenceCheck(courseId)) {
			Set<Course> courses = DataBaseEntry.infoDb();
			for (Course cor : courses) {
				if (cor.getCourseId().equalsIgnoreCase(courseId)) {
					ICrudOperation<Course> iCrudOperation = (ICrudOperation<Course>) new CourseOperationDaoImpl();
					// iCrudOperation.addCourses(courses);
				}
			}

		}

		return false;
	}

	@Override
	public boolean deleteCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException {
		if (DataExistenceCheck.DataExistenceCheck(courseId)) {
			Set<Course> courses = DataBaseEntry.infoDb();
			Course courseTemp = null;
			for (Course cors : courses) {
				if (cors.getCourseId().equals(courseId)) {
					courseTemp = cors;
					break;
				}
			}
			if (courseTemp != null) {
				courses.remove(courseTemp);
			} else {
				throw new InvalidCourseIdException("Not valid course");
			}
		}
		return false;

	}

	@Override
	public boolean modifyCourse(String courseId, String courseName, String courseDesc, int courseCharges, Course course)
			throws InvalidCourseIdException, InvalidCourseNameException {
		// if(UserInputValidator.courseNameValid(courseName) ) {
		HashSet<Course> co = (HashSet<Course>) DataBaseEntry.course;
		Iterator<Course> value = co.iterator();
		while (value.hasNext()) {
			Course cor = (Course) value.next();
			if (courseName.equals(cor.getCourseName()))
				cor.setCourseId(courseId);
			// cs.modifyCourse(course);

		}
		return false;

	}

	@Override
	public Set<Course> getAllCourse() throws SQLException {
		ICrudOperation<Course> iCrudOperation = new CourseOperationDaoImpl();
		HashSet<Course> courses = iCrudOperation.retrieveAll();
		return courses;

	}

	@Override
	public Course retrieveCourse(String courseId) throws SQLException, courseIdNotFoundException 
	{
		//System.out.println("1st stmnt");
		ICrudOperation<Course> crudOperation = new CourseOperationDaoImpl();
		//System.out.println("2nd ");
		Course courses = crudOperation.retrieveCourse(courseId);
		//System.out.println("3rd "+courses);


		return courses;

	}

//	@Override
//	public Set<Course> retrieveCourse(Set<Course> courses) throws SQLException, courseIdNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
