package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) {
		try {

			// STEP 1 : load the class driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// STEP 2 : Connection Establish
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", "root", "root");

			// STEP 3 : Create Statement to the Connection
			Statement st = conn.createStatement();

			// STEP 4 : Execute the Query
			ResultSet rs = st.executeQuery("SELECT * FROM EMP");

			while (rs.next()) {
				System.out.println(rs.getInt("empno") + " " + rs.getString("ename") + " "+ rs.getString("job"));
			}

			// STEP 5 : Close the Connection
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
