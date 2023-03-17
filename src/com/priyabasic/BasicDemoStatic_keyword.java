package com.priyabasic;

class Mobile{
	String Brand;
	int Price;
	static String name; // making the variable static 
	
	public void mshow() {
		System.out.println(Brand + ":" + Price + ":" + name);
	}
	
	
}

public class BasicDemoStatic_keyword {

	public static void main(String[] args) {
		
	Mobile obj1 = new Mobile();
	obj1.Brand = "Sam";
	obj1.Price = 2000;
	obj1.name = "smartphone";
	
	Mobile obj2 = new Mobile();
	obj2.Brand = "app";
	obj2.Price = 3000;
	//obj2.name = "smartphone";
	Mobile.name = "smartphone"; // if we have static variable then call with class name instead of object name
	
	obj1.name = "ph"; // it will print the static value for all the objects even if we assign(overrite) the value for one object
	//static variable be shared with all the objects. due to which if we change for one object it will reflect for all the objects.
	obj1.mshow(); // it will give the assigned values 
	obj2.mshow();
	
	
	//System.out.println(obj1.mshow);
	
		
	}

}

