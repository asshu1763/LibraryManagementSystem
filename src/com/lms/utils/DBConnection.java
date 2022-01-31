package com.lms.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DBConnection {
	private static Connection connection;
	public static Connection openConnection() {
		try {
			DriverManager.registerDriver(new Driver());
			String url = "jdbc:mysql://localhost:3306/LibraryManagementSystem";
			connection = DriverManager.getConnection(url, "root", "Asshu@1763");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}
	public static void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
