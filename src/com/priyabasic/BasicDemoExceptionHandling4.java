package com.priyabasic;

class PriyaException extends Exception { //we can create our own exception by extending Exception class(super class for all exceptions)
	public PriyaException(String str) {
		super(str); //we need to catch the message by passing super.
	}
}

public class BasicDemoExceptionHandling4 {

	public static void main(String[] args) {
		int i =40; 
		int j = 0;
				
		try 
		{
		j= 15/i; 
		if(j==0)
			throw new PriyaException("throw");
		 
		}
		
		catch(PriyaException e) { 
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


