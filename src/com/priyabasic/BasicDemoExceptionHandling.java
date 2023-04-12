package com.priyabasic;

public class BasicDemoExceptionHandling {

	public static void main(String[] args) {
		//int i =10; //normat statement
		int i =0; //will get arithmatic exception. we have to handle it
		//int j = 20/i; //critical statement
		int j = 0;
		try //we are saying try to execute the below logic
		{
		j= 15/i;
		}
		catch(Exception e) { //if something went wrong then catch the error
			System.out.println("correct it"); //sending appropriate o/p
		}
		System.out.println(j); //will continue executing these statements even there is error in above logic
		System.out.println("great !!");
	}

}
