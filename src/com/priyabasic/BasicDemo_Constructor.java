package com.priyabasic;

class Human1{
	
	public Human1() { //creating constructor. it has same name as class and no return type.
		age = 27;
		name = "some"; // it is default constructor and passing the vales explicitly
		//System.out.println("in const");
	}
	
	public Human1(String name, int age) { // creating parameterized constructor
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;
	
	public String getName() { 
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

public class BasicDemo_Constructor {

	public static void main(String[] args) {
		
		Human1 obj1 = new Human1(); // when we create object(even if we dont assign/set the values) constructor will be called.
//		obj1.setName("Sai"); 
//		obj1.setAge(25);
		
		Human1 obj2 = new Human1("para", 9); // providing values to parameterized constructor
		
		
		//System.out.println(obj1.name);
		System.out.println(obj1.getName() + ":" + obj1.getAge()); 
		System.out.println(obj2.getName() + ":" + obj2.getAge()); 
	}

}

