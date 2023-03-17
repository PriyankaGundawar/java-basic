package com.priyabasic;

//final class S{ //if we make class final we cannot inherit or extend by other class
class S{
	public void show() {
		System.out.println("In S");
	}
	//public final void dis() { //if we make the method as final it cannot be used in child class. it will give error
	public void dis() { 	
	System.out.println("by priya");
	}
}

class T extends S{
	public void dis() { 
		System.out.println("by me");
	}
}

public class BasicDemoFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int marks = 2;
		final int marks = 2; // if we make the variable final we cannot assign(ovverrite the values).
		//marks =3;
		System.out.println(marks);
		
		T obj = new T();
		obj.dis();
	
	}

}

//if we make class final we cannot inherit or extend by other class. it will give error in child class,
//if we make the method as final it cannot be used in child class. it will give error in child class
//if we make the variable final we cannot assign(ovverrite the values).
