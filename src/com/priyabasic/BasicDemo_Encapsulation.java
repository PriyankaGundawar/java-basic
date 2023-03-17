package com.priyabasic;

// binding the data is called encapsulation. 
// making the variable as private and we can use those only by methods created in same class is encapsulation.

class Human{
//	private String name = "priya"; // values set to get the values using get methods
//	private int age = 20;
	
	private String name;
	private int age;
	
	public String getName() { //creating methods inside the class to use private variables
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
}

//using above 'get 'methods inside the class, we can get the variable values below
//using above 'set' methods inside the class we can set the variable values below

//we can right click and create get & set methods for each variables in class. 
//it will use 'this' keyword to give the object to set the values.


public class BasicDemo_Encapsulation {

	public static void main(String[] args) {
		
		Human obj1 = new Human();
//		obj1.name = "priya"; // we cannot use private variable directly
//		obj1.age = 15;
		
		obj1.setName("Sai"); //assigning the values to variable using set methods
		obj1.setAge(25);
		
		//System.out.println(obj1.name);
		System.out.println(obj1.getName() + ":" + obj1.getAge()); // getting name of private variable using method name
	}

}

