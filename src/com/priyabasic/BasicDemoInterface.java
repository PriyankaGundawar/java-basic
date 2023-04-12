package com.priyabasic;

interface In{ //contains all the abstract methods
	
	int marks = 70; //by default variables in Interface are final and static
	int data = 20;
	
	// public abstract void show(); //no nee to mention public abstract.
	  void show(); //bu default it will be public abstract
	 public abstract void display();
}

class Cl implements In{ //need to implement all the methods from Interface otherwise it will become abstract class.
	
	public void show() {
		
		System.out.println("In show");
	}
	
	public void display() {
	
		System.out.println("In display");	
	}
	
}
public class BasicDemoInterface {

	public static void main(String[] args) {
	
		In obj; //we cannot directly create object of interface.
		obj = new Cl(); //we can create reference of interface and object of implementation class.
		obj.show();
		obj.display();
		//In.marks = 60; //we cannot assign values for final and static variables.
		System.out.println(In.marks); //we can directly call variables.
	}

}

//if we do not implement all the methods in class it will become abstract class and need to create one class to implement the methods.
