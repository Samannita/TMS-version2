package com.cg.trainingmanagementsystem.dao.impl;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.cg.trainingmanagementystem.exception.ErrorMessagesException;

import com.cg.trainingmanagementystem.exception.Programexception;

import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bean.Course;
import com.cg.trainingmanagementystem.utility.DBConnection;
import com.cg.trainingmanagementystem.utility.Queries;
import com.cg.trainingmanagementystem.utility.UserInputValidator;

public class CourseOperationDaoImpl implements ICrudOperation<Course> {

	// this method will retrieve all the courses available in the database

	@Override
	public HashSet<Course> retrieveAll() throws SQLException {
		// Step-1:open connection
		Connection connection = DBConnection.getConnection();
		String sql = Queries.COURSE_DETAILS;
		PreparedStatement preparedStatement = null;
		Set<Course> courses = null;
		System.out.println(connection);
		try {
			// Step-2:execute query
			preparedStatement = connection.prepareStatement(sql);
			courses = new HashSet<Course>();
			ResultSet rs = preparedStatement.executeQuery(sql);
			// Step-3:extract data from result set
			while (rs.next()) {
				Course course = new Course();
				course.setCourseId(rs.getString(1));
				course.setCourseName(rs.getString(2));
				course.setCourseDesc(rs.getString(3));
				course.setCourseCharges(rs.getInt(4));
				courses.add(course);

			}
			// Step-4:Closing
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Connection connections = DBConnection.closeConnection();
		return (HashSet<Course>) courses;
	}

//	this method will delete a course by giving the courseId

	@Override
	public boolean delete(String courseId) throws SQLException, Programexception {
		// TODO Auto-generated method stub
		boolean flag = false;

		Connection connection = DBConnection.getConnection();
		String sql = Queries.DELETE_COURSE ;
		PreparedStatement preparedStatement = null;
		Set<Course> courses = null;
		System.out.println(connection);

		try {
			// Step-2:execute query
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, courseId);

			preparedStatement.execute();
			connection.commit();

			// preparedStatement.close();
		} catch (SQLException ex) {
			throw new Programexception(ErrorMessagesException.MESSAGE1);
		} catch (Exception e) {
			throw new Programexception(ErrorMessagesException.MESSAGE2);
		}

		Connection connections = DBConnection.closeConnection();
		return flag;
	}

	// this method will create course and that will be added to the database

	@Override
	public boolean create(Course course) throws SQLException, Programexception {
		// Step-1 : connection
		Connection connection = DBConnection.getConnection();
//		
		String sql = Queries.ADD_COURSE;
		PreparedStatement preparedStatement = null;

		boolean value = false;
		try {
			// Step-2:execute query
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, course.getCourseId());
			preparedStatement.setString(2, course.getCourseName());
			preparedStatement.setString(3, course.getCourseDesc());
			preparedStatement.setInt(4, course.getCourseCharges());

			preparedStatement.execute();

			connection.commit();

			// preparedStatement.close();

		} catch (SQLException ex) {
			throw new Programexception(ErrorMessagesException.MESSAGE1);
		} catch (Exception e) {
			throw new Programexception(ErrorMessagesException.MESSAGE2);
		}

		Connection connections = DBConnection.closeConnection();

		return value;
	}

//this method will fetch a particular course details by giving the courseId

	@Override
	public Course retrieveCourse(String courseId) throws SQLException, Programexception {

		Connection connection = DBConnection.getConnection();

		String sql = Queries.COURSE_DETAILS_THROUGH_COURSEID ;

		PreparedStatement preparedStatement = null;
		Course course = null;

		try {
			// Step-2:execute query
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, courseId);
			System.out.println(courseId);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				course = new Course();
				course.setCourseId(rs.getString(1));
				course.setCourseName(rs.getString(2));
				course.setCourseDesc(rs.getString(3));
				course.setCourseCharges(rs.getInt(4));

			}

			// Step-4:Closing
			rs.close();

		} catch (SQLException ex) {

			throw new Programexception(ErrorMessagesException.MESSAGE1);
		} catch (Exception e) {
			throw new Programexception(ErrorMessagesException.MESSAGE2);
		}

		return course;

	}
}