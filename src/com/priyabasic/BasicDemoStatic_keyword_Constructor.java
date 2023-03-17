package com.priyabasic;

class Mobile2{
	String Brand;
	int Price;
	static String name; // making the variable static 
	
		
	public void mshow() {
		System.out.println(Brand + ":" + Price + ":" + name);
	}
	
	public static void stshow(Mobile2 obj) {
		//System.out.println(Brand + ":" + Price + ":" + name); // we cannot call non static variable in static method
		System.out.println(obj.Brand + ":" + obj.Price + ":" + name);  //throws error
		// if we create the object in method as above (Mobile2 obj) we can call non static variables in static method
	}
}

public class BasicDemoStatic_keyword_Constructor {

	public static void main(String[] args) {
		
	Mobile2 obj1 = new Mobile2();
	obj1.Brand = "Sam";
	obj1.Price = 2000;
	obj1.name = "smartphone";
		
	Mobile2 obj2 = new Mobile2();
	obj2.Brand = "App";
	obj2.Price = 20005;
	obj2.name = "smartphone";
	
	//obj1.mshow();
	//obj2.mshow();
	
	Mobile2.stshow(obj1); // it gives the obj1 details
	
			
	}

}

