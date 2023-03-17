package com.priyabasic;

class A{ // every class in java by default extends object class(class A extends object)
	public A() {
		System.out.println("In A");
	}
	public A(int m) {
		System.out.println("In A int");
	}
}

class B extends A{ 
	public B() {
		System.out.println("In B");	
	}
	
	public B(int n) {
		super(); //call the constructor of super class. by default it will be there even if we do not mention.
		//it will call default constructor from class A(super class).
		//if we explicitly mention super(n); then it will call parameterized constructor from super class along with class B.
		System.out.println("In B int");
	}
}

public class BasicDemo_Super_this {

	public static void main(String[] args) {
		
		//B obj = new B(6); // it will call parameterized constructor class B and class B calls Class A constructor
		B obj = new B(); // it will call default constructor class B and then class B calls class A constructor.
	}

}
