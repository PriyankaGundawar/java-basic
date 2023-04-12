package com.priyabasic;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class BasicDemoJDBCClassforName {

	public static void main(String[] args) throws Exception {
		
		
		//Jdbcdemo obj = new Jdbcdemo();
		//Class.forName("com.priyabasic.Jdbcdemo1"); //it load the class and exceutes static block.
		//Class.forName("com.priyabasic.Jdbcdemo1").newInstance(); //it creates new object and execute static and instance block.
	
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //to load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //this statement internally calls the "DriverManager.registerDriver"
		
	
	}

}

class Jdbcdemo1 {
	static { //when we load class static block will get executed(Jdbcdemo obj)
		System.out.println("in static"); 
	}
	
	//Instance block. //when we create object instance block will get executed(new Jdbcdemo).
	{
		System.out.println("In instance"); 
	}
}


