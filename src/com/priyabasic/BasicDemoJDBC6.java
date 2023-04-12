package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBC6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/priyadb?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query ="Delete from student where rollno=3";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);	//deleting record
		
		System.out.println(count);
		
		st.close();
		con.close();
		
		

	}

}
