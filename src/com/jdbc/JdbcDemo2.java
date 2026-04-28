package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo2 {

	public static void main(String[] args) {
		
		        try {
		            // 1. Get connection
		            Connection con = DriverManager.getConnection(
		                "jdbc:mysql://localhost:3306/institute", "root", "root");

		            // 2. Create PreparedStatement
		            String query = "select * from emp where job= ?";
		            PreparedStatement ps = con.prepareStatement(query);

		            // 3. Set value for ?
		            ps.setString(1, "clerk");

		            // 4. Execute query
		            ResultSet rs = ps.executeQuery();

		            // 5. Process result
		            while (rs.next()) {
		                System.out.println(
		                    rs.getInt("empno") + " " +
		                    rs.getString("ename"));
		            }

		            // 6. Close connection
		            con.close();

		        } catch (Exception e) {
		            System.out.println(e);
		        }
		    }

	}


