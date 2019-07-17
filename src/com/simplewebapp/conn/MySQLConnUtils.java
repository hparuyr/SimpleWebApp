package com.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/testDB";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "Rootroot";
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		return getMySQLConnection(DB_URL, USER, PASS);
	}

	public static Connection getMySQLConnection(String dbHost, String userName, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(dbHost, userName, password);
		return conn;
	}

}
