package com.cg.trainingmanagementystem.utility;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.trainingmanagementystem.exception.ErrorMessagesException;
//import com.cg.trainingmanagementystem.exception.courseIdNotFoundException;

public class DBConnection {
	static Connection connection = null;
	static PreparedStatement preparedStatement = null;

	public static Connection getConnection() throws SQLException {
		if (connection == null) {

			try {
				connection = DriverManager.getConnection("jdbc:oracle:thin:@10.236.246.20:1521:xe", "sys as sysdba",
						"system");

			} catch (SQLException e) {
				throw new RuntimeException("Error connecting to the database", e);
			}
		}
		return connection;

	}

	public static Connection closeConnection() throws SQLException {

		try {
			if (preparedStatement != null)
				connection.close();
		} catch (SQLException se) {
			throw new RuntimeException("Error connecting to the database", se);
		}
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return connection;

	}
}
