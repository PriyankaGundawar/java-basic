package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBC7 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/priyadb?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query ="update student set Name='Pillu' where rollno=4";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);	//updating the record
		
		System.out.println(count);
		
		st.close();
		con.close();
		
		

	}

}
