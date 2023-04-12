package com.priyabasic;

public class BasicDemoExceptionHandling3 {

	public static void main(String[] args) {
		int i =40; 
		int j = 0;
				
		try 
		{
		j= 15/i; 
		if(j==0)
			throw new ArithmeticException("throw");
		 
		}
		
		catch(ArithmeticException e) { 
			j=15/1;
			System.out.println("default logic to execute when try logic goes wrong ," + e); 
		}
		
		catch(Exception e) 
		{
			System.out.println("something went wrong " + e);
		}
		
		System.out.println(j); 
		System.out.println("great !!");
	}

}

//we can write a logic in catch block when something went wrong in try block.
//if we are some value,  that should not match in result of try block then we need to throw the exception which can catch in catch block.
