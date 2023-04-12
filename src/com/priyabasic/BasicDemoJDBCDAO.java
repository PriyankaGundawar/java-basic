package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBCDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentDAO dao = new StudentDAO();
		StudentD s1 = dao.getName(5);
		System.out.println(s1.SName);

	}

}

class StudentDAO{
	public StudentD getName(int rollno) throws ClassNotFoundException, SQLException{
		String query = "select Name from Student where rollno="+rollno;
		StudentD s = new StudentD();
		s.rollno = rollno;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/priyadb?useSSL=false", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
		s.SName = name;		
		return s;
		
	}
}

class StudentD{
	int rollno;
	String SName;
}
