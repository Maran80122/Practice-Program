package com.crud.index;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static final String DB_URL="jdbc:mysql://localhost:3306/JDBC"; //database name
	 private static final String USER="root";
	private static final String PASS="Maran@9095";
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(DB_URL,USER,PASS);
	}

}
