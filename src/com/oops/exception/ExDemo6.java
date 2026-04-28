package com.oops.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExDemo6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class Loaded Successfully ");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","root");
		System.out.println("Connection created Succesfully");
		
		Statement st = con.createStatement();
		
		String sql="delete from student where sid =3";
		int rs = st.executeUpdate(sql);
		
		System.out.println(rs + " deleted successfully");
		con.close();
	}

}
