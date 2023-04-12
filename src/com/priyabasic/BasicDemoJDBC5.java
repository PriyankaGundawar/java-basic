package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBC5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/priyadb?useSSL=false";
		String uname = "root";
		String pwd = "root";
		int rollno = 6;
		String Name = "Tara";
		String query ="insert into student values(?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, rollno);
		st.setString(2, Name);		
		
		int count = st.executeUpdate();	//inserting data
		
		System.out.println(count);


		
		st.close();
		con.close();
		
		

	}

}
