package com.cg.trainingmanagementsystem.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.ErrorMessages;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.InvalidCourseNameException;
import com.cg.trainingmanagementystem.exception.courseIdNotFoundException;
import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bin.Course;
import com.cg.trainingmanagementystem.utility.DBConnection;
import com.cg.trainingmanagementystem.utility.Queries;
import com.cg.trainingmanagementystem.utility.UserInputValidator;

public class CourseOperationDaoImpl implements ICrudOperation<Course> {

	@Override
	public HashSet<Course> retrieveAll() throws SQLException {
		// Step-1:open connection
		Connection connection = DBConnection.getConnection();
		String sql = Queries.Course_Details;
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
//		} finally {
//			try {
//				if (preparedStatement != null)
//					connection.close();
//			} catch (SQLException se) {
//			}
//			try {
//				if (connection != null)
//					connection.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//
//		}
		Connection connections = DBConnection.closeConnection();
		return (HashSet<Course>) courses;
	}

	@Override
	public boolean update(Course course) throws InvalidCourseIdException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = DBConnection.getConnection();
		String sql = Queries.Update_course;
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
				Course coursedto = new Course();
				coursedto.setCourseId(rs.getString(1));
				coursedto.setCourseName(rs.getString(2));
				coursedto.setCourseDesc(rs.getString(3));
				coursedto.setCourseCharges(rs.getInt(4));
				courses.add(coursedto);

			}
			// Step-4:Closing
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		} finally {
//			try {
//				if (preparedStatement != null)
//					connection.close();
//			} catch (SQLException se) {
//			}
//			try {
//				if (connection != null)
//					connection.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//
//		}
		Connection connections = DBConnection.closeConnection();
		return false;
	}

	@Override
	public boolean delete(Course course) throws InvalidCourseIdException, SQLException, courseIdNotFoundException {
		// TODO Auto-generated method stub
		Course course2 = new Course();
		Connection connection = DBConnection.getConnection();
		String sql = Queries.Delete_Course;
		PreparedStatement preparedStatement = null;
		Set<Course> courses = null;
		System.out.println(connection);

		try {
			// Step-2:execute query
			preparedStatement = connection.prepareStatement(sql);
			courses = new HashSet<Course>();

			ResultSet rs = preparedStatement.executeQuery(sql);
			String CId = course2.getCourseId();
			// Step-3:extract data from result set
			while (rs.next()) {
				if (CId.equals(rs.getString(1))) {
					Course coursedto = new Course();
					coursedto.setCourseId(rs.getString(1));
					coursedto.setCourseName(rs.getString(1));
					coursedto.setCourseDesc(rs.getString(2));
					coursedto.setCourseCharges(rs.getInt(3));
					courses.add(coursedto);

				}
			}
			// Step-4:Closing
			rs.close();
		} catch (SQLException ex) {
			throw new courseIdNotFoundException(ErrorMessages.MESSAGE1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Connection connections = DBConnection.closeConnection();
		return false;
	}

	@Override
	public boolean create(Course course) throws CourseNullException, SQLException {
		Connection connection = DBConnection.getConnection();
		String sql = Queries.Add_Course;
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
				Course coursedto = new Course();
				coursedto.setCourseId(rs.getString(1));
				coursedto.setCourseName(rs.getString(2));
				coursedto.setCourseDesc(rs.getString(3));
				coursedto.setCourseCharges(rs.getInt(4));
				courses.add(coursedto);

			}
			// Step-4:Closing
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Connection connections = DBConnection.closeConnection();
		return false;
	}

	@Override
	public Course retrieveCourse(String courseId) throws SQLException, courseIdNotFoundException {

		Connection connection = DBConnection.getConnection();

		Course course = null;
		String sql = Queries.Course_Details_Through_CourseId;

		PreparedStatement preparedStatement = null;

		try {
			// Step-2:execute query
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, courseId);
			System.out.println(courseId);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				course = new Course();
				course.setCourseName(rs.getString(1));
				course.setCourseName(rs.getString(2));
				course.setCourseDesc(rs.getString(3));
				course.setCourseCharges(rs.getInt(4));
				// System.out.println(rs.getString(1));
			}

			// }
			// Step-4:Closing
			rs.close();

		} catch (SQLException ex) {
			System.out.println("1");
			throw new courseIdNotFoundException(ErrorMessages.MESSAGE1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return course;

	}
}