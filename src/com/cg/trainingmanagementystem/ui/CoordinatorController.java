package com.cg.trainingmanagementystem.ui;

import java.sql.SQLException;
import java.util.HashSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import com.cg.trainingmanagementsystem.dao.impl.DataBaseEntry;

import com.cg.trainingmanagementystem.exception.InvalidFormatInput;
import com.cg.trainingmanagementystem.exception.Programexception;

import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bean.Course;
import com.cg.trainingmanagementystem.service.impl.CourseOperationImpl;
import com.cg.trainingmanagementystem.utility.DataExistenceCheck;
import com.cg.trainingmanagementystem.utility.UserInputValidator;

//this controller class is a connection between UI and the service class 
public class CoordinatorController {
	ICourseOperation courseOperationImpl = new CourseOperationImpl();

// this method will call the addCourse() of courseOpeartionImpl
	public boolean addCourse() throws SQLException, Programexception, InvalidFormatInput {

		Scanner scanner = new Scanner(System.in);

		boolean flag = false;

		System.out.println("Enter Course Id:\n");
		String courseId = scanner.next();
		System.out.println("enter Course Name:\n");
		String courseName = scanner.next();
		System.out.println("Enter Course Description:\n");
		String courseDesc = scanner.next();
		System.out.println("Enter Course Fees:\n");
		int courseCharges = scanner.nextInt();

		Course course = new Course(courseId, courseName, courseDesc, courseCharges);

		if (UserInputValidator.courseIdValidLength(courseId) || UserInputValidator.courseNameValid(courseName)) {

			flag = courseOperationImpl.addCourse(courseId, courseName, courseDesc, courseCharges, course);

		}

		else {

			throw new InvalidFormatInput("Not valid course");

		}

		return flag;
	}

	// this method will call the deleteCourse() of courseOpeartionImpl

	public static void deleteCourse() throws SQLException, Programexception, InvalidFormatInput {
		ICourseOperation courseOperationImpl = new CourseOperationImpl();

		Scanner scanner = new Scanner(System.in);
		boolean flag = false;

		System.out.println("Enter Course Id:\n");
		String courseId = scanner.next();
		Course course = new Course();

		if (UserInputValidator.courseIdValidLength(courseId)) {
			flag = courseOperationImpl.deleteCourse(courseId);
		}
	}

	// this method will call the getallCourse() of courseOpeartionImp

	public void getCourseDetails() throws SQLException {
		ICourseOperation courseOperationImpl = new CourseOperationImpl();
		Set<Course> courseSet = new HashSet<Course>();
		courseSet = courseOperationImpl.getAllCourse();
		for (Course course : courseSet)
			System.out.println("Courses availabe are:\n" + course);

	}

	// this method will call the retrieveCourse() of courseOpeartionImpl

	public void retrieveCourse() throws SQLException, Programexception, InvalidFormatInput {
		Scanner scanner = new Scanner(System.in);
		ICourseOperation courseOperation = new CourseOperationImpl();

		System.out.println("Enter courseId:");
		String courseId = scanner.next();
		if (UserInputValidator.courseIdValidLength(courseId)) {

			Course courses = courseOperation.retrieveCourse(courseId);

			System.out.println("Course details:" + courses);

		} else {
			throw new InvalidFormatInput("Please enter a valid course id");
		}
	}

}