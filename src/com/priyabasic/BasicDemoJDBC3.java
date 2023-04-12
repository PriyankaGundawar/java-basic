package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBC3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/priyadb?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query ="insert into student values(4,'Sai')";
		
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		//ResultSet rs = st.executeQuery(query);
		int count = st.executeUpdate(query);	//inserting data
		
		System.out.println(count);


		
		st.close();
		con.close();
		
		

	}

}
