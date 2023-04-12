package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBC2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/priyadb?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query ="Select * from student";
		
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String userData="";
		
//		rs.next();
//		userData = rs.getInt(1)+ ":" + rs.getString(2);
//		System.out.println(userData);
//		
//		rs.next();
//		userData = rs.getInt(1)+ ":" + rs.getString(2);
//		System.out.println(userData);
		
		
		//to get all the records we need to use while loop
		
		while(rs.next()) {
		userData = rs.getInt(1)+ ":" + rs.getString(2);
		System.out.println(userData);
		}
		
		st.close();
		con.close();
		
		

	}

}
