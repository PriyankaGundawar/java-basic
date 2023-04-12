package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBC1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/priyadb?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query ="Select Name from student where rollno=2";
		
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("Name");
		System.out.println(name);
		
		st.close();
		con.close();
		
		

	}

}
