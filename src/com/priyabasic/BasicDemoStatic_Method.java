package com.priyabasic;

class Mobiles{
	String Brand;
	int Price;
	static String name; // making the variable static 
	
	public Mobiles() { // creating constructor
		Brand ="";
		Price = 100;
		System.out.println("in cons");
	}
	
	static { //making the name variable static using static block. instaed of calling multiple times it will get called only once
		//even if we crete multiple objects
		name = "phone"; 
		System.out.println("in static");
	}

	
	public void mshow() {
		System.out.println(Brand + ":" + Price + ":" + name);
	}
	
	
}

public class BasicDemoStatic_Method {

	public static void main(String[] args) {
		
	Mobiles obj1 = new Mobiles();
	obj1.Brand = "Sam";
	obj1.Price = 2000;
	//Mobiles.name = "smartphone";
		
	Mobiles obj2 = new Mobiles();
	
	obj1.mshow();
	obj2.mshow();
	
			
	}

}

