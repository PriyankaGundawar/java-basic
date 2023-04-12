package com.priyabasic;

public class BasicDemoExceptionHandling2 {

	public static void main(String[] args) {
		int i =5; 
		int j = 0;
		String str = null;
		
		int nums[] = new int[3];
		
		try 
		{
		j= 15/i; //if this statement is correct the it will execute next statement. if not it will directly jump to catch block.
		System.out.println(str.length());
		System.out.println(nums[2]); //even 
		}
		
		//catch(Exception e) { 
		catch(ArithmeticException e) { //need to provide different exceptions for different logic statements
			System.out.println("cannot divide by zero ," + e); //even first statement is correct it will display this message and second statement execption
		}
		
		catch(ArrayIndexOutOfBoundsException e) { //catching array exceptions
			System.out.println("provide array limited values ," + e);
		}
		
		catch(Exception e) //we need to give this parent exception as 
		//it will handle all the exceptions as we do not know the logic we write has what kind of exceptions.
		{
			System.out.println("something went wrong " + e);
		}
		
		System.out.println(j); 
		System.out.println("great !!");
	}

}

//the parent exception catch block should be bottom of all exceptions.(if we are specifying/catching any particular type of exception)
