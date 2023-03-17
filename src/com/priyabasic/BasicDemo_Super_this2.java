package com.priyabasic;

class A1{ // every class in java by default extends object class(class A extends object)
	public A1() {		
		System.out.println("In A");
	}
	public A1(int m) {		
		System.out.println("In A int");
	}
}

class B1 extends A1{ 
	public B1() {
		System.out.println("In B");	
	}
	
	public B1(int n) {
		this(); //it will executes the constructor of same class
		System.out.println("In B int");
	}
}

public class BasicDemo_Super_this2 {

	public static void main(String[] args) {
		
		B1 obj = new B1(6); // it will call parameterized constructor class B and class B calls Class A constructor
		//B obj = new B(); // it will call default constructor class B and then class B calls class A constructor.
	}

}
