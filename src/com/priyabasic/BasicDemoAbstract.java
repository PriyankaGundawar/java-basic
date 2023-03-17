package com.priyabasic;

abstract class Car{ //abstract class can have abstract methods and normal methods. abstract class may or may not cointain abstract methods.
	//but abstarct method should be in abstract class.
	public abstract void drive(); //if you create the method and dont implement it is called abstract method.
	public abstract void fly();
	public void music() {
		System.out.println("lets play music..");
	}
}

abstract class Ford extends Car{
	public void drive() { //if we have abstract method in super class it should be implemented in child class. otherwise it will give error.
		System.out.println("driving..");
	}
}

class Fiesta extends Ford{ //concrete class
	public void fly(){
		System.out.println("flying..");
	}
}

public class BasicDemoAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car obj = new Ford();//we cannot create object of abstract class. but we can create refrence of abstract class and object of child class.
		Car obj = new Fiesta();//need to create object of non abstract class.
		obj.drive();
		obj.music();
		obj.fly();
	}

}

//if we have multiple abstract methods in oneclass and we dont implement in child class, then we need to make child class as abstract.
//need to create one more child class and need to implement the method.
