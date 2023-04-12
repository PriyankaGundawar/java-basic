package com.priyabasic;

import java.sql.*;

public class BasicDemoJDBCDAO2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentDAO1 dao = new StudentDAO1();
		StudentDD s2 = new StudentDD();
		s2.rollno = 7;
		s2.SName = "Naira";
		dao.connect();
		dao.addStudent(s2);
		
		

	}

}

class StudentDAO1{
	
	Connection con = null;
	
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/priyadb?useSSL=false", "root", "root");
		
	}
	
	public StudentDD getName(int rollno) throws ClassNotFoundException, SQLException{
		String query = "select Name from Student where rollno="+rollno;
		StudentDD s = new StudentDD();
		s.rollno = rollno;
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
		s.SName = name;		
		return s;
		
	}
	
	public void addStudent(StudentDD ss) throws SQLException {
		String query = "insert into Student values(?,?)";
		PreparedStatement pst = con.prepareStatement(query);		
		pst.setInt(1, ss.rollno);
		pst.setString(2, ss.SName);
		pst.executeUpdate();
		
	}
}

class StudentDD{
	int rollno;
	String SName;
}
