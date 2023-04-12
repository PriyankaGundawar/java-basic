package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBC4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/priyadb?useSSL=false";
		String uname = "root";
		String pwd = "root";
		int rollno = 5;
		String Name = "Sharan";
		String query ="insert into student values(" + rollno + ",'" + Name + "')";
		
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
