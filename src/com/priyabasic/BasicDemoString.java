package com.priyabasic;

public class BasicDemoString {

	public static void main(String[] args) {
		//String name = new String();
		//String name = new String("priya"); //String is a class
		String name = "priya"; //usual way we use. no need to create object
		//name = name + " Gunda"; // it creates new object in heap memory
		System.out.println("Hello " + name);
		
		String s1 = "sai";
		String s2 = "sai"; // it doesn't create the new object instead if the same values it available it will get the value
	    
		System.out.println(s1==s2); //getting true as its the same object
		
		//we have String constant pool in heap memory, if we are assigning same value to multiple 
		//ref variable instead creating creating new object every time it will check if the value is available or not
		//if it is available then same address will be assigned to ref variables in stack.
		
		//immutable String - unchange
		//mutable String   - change
	}

}

