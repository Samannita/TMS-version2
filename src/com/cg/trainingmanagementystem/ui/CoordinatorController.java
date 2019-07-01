package com.cg.trainingmanagementystem.ui;

import java.sql.SQLException;
import java.util.HashSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import com.cg.trainingmanagementsystem.dao.impl.DataBaseEntry;
import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.InvalidCourseNameException;
import com.cg.trainingmanagementystem.exception.courseIdNotFoundException;
import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bin.Course;
import com.cg.trainingmanagementystem.service.impl.CourseOperationImpl;
import com.cg.trainingmanagementystem.utility.DataExistenceCheck;
import com.cg.trainingmanagementystem.utility.UserInputValidator;


public class CoordinatorController {
	 ICourseOperation courseOperationImpl = new CourseOperationImpl();
	public   void addCourseController() throws InvalidCourseIdException, InvalidCourseNameException, CourseNullException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Before adding course:\n");
		//ICourseOperation iCourseOperation= new CourseOperationImpl();
		Set<Course> courses = DataBaseEntry.infoDb();
		System.out.println("Enter Course Id:\n");
		String courseId = scanner.next();
		System.out.println("enter Course Name:\n");
		String courseName = scanner.next();
		System.out.println("Enter Course Description:\n");
		String courseDesc = scanner.next();
		System.out.println("Enter Course Fees:\n");
		int courseCharges = scanner.nextInt();
		// System.out.println("After courses entered:");
		Course course = new Course(courseId, courseName, courseDesc, courseCharges);
		//for(Course courseTemp: courses) {
		if (true) {
//			if((DataBaseEntry.infoDb().contains(courseId))) 
//			{
				System.out.println("Course id alredy exists");//}
//			else {
			courses.add(course);
//			}
		}
		else {
			throw new InvalidCourseIdException("Not valid course");
		}
	
		System.out.println("After adding course" + courses);
	}

//	
	public static void deleteCourseController() throws InvalidCourseIdException, InvalidCourseNameException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Before removing course:\n");
		
		Set<Course> course =DataBaseEntry.infoDb();
		System.out.println("Enter Course Id:\n");
		String courseId = scanner.next();

		Course courseTemp = null;
		for (Course cors : course) {
			if (cors.getCourseId().equals(courseId)) {
				courseTemp = cors;
				break;
			}
		}
		if (courseTemp != null) {
			course.remove(courseTemp);
			//courseOperationImpl.deleteCourse(courseId);
		}
		else {
			throw new InvalidCourseIdException("Please enter a valid Course Id");
		}
		
		System.out.println("After removing course" + course);
	}

	public static void modifyCourseController() throws InvalidCourseNameException, InvalidCourseIdException {
		Scanner scanner = new Scanner(System.in);
		Set<Course> course = DataBaseEntry.infoDb();
		System.out.println("Enter Course Name:\n");
		String courseName = scanner.next();
		System.out.println("enter Course Name for updation:\n");
		String updatedCourseName = scanner.next();

		Iterator<Course> value = course.iterator();
		while (value.hasNext()) {
			Course cor = (Course) value.next();
			if (courseName.equals(cor.getCourseName()))
				cor.setCourseName(courseName);
		}
		System.out.println("After updating course" + course);
		scanner.close();
	}

	public void  getCourseDetailsController() throws SQLException {
		ICourseOperation courseOperationImpl = new CourseOperationImpl();
		Set<Course> courseSet = new HashSet<Course>();
		 courseSet = courseOperationImpl.getAllCourse();
		 for(Course course : courseSet)
		 System.out.println("Courses availabe are:\n" +course);
		//return course;
		//return courseSet;

	}
	
	public void retrieveCourse() throws SQLException, courseIdNotFoundException {
		Scanner scanner = new Scanner(System.in);
		ICourseOperation courseOperation = new CourseOperationImpl();
		//String courses = new HashSet<Course>();
		System.out.println("Enter courseId:");
		String courseId= scanner.next();
		//System.out.println("---1");
		Course courses = courseOperation.retrieveCourse(courseId);
		//System.out.println("---2");
		//for(Course course: courses) {
			System.out.println("Course details:" +courses);
		//}
	}

}