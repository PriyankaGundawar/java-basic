package com.priyabasic;

class Mobiles1{
	String Brand;
	int Price;
	static String name; // making the variable static 
	
	public Mobiles1() { // creating constructor
		Brand ="";
		Price = 100;
		System.out.println("in cons");
	}
	
	static { 
		name = "phone"; 
		System.out.println("in static");
	}

	
	public void mshow() {
		System.out.println(Brand + ":" + Price + ":" + name);
	}
	
	
}

public class BasicDemoStatic_keyword_Constructor_class {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.priyabasic.Mobiles1"); //through the class 'Class' we can call the above class without creating the objects.
				
//	Mobiles obj1 = new Mobiles();
//	obj1.Brand = "Sam";
//	obj1.Price = 2000;
//	//Mobiles.name = "smartphone";
//		
//	Mobiles obj2 = new Mobiles();
//	
//	obj1.mshow();
//	obj2.mshow();
	
			
	}

}

