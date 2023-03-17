package com.priyabasic;

import java.util.Objects;

class Lap{ //by default every class inherits object class.
	String model;
	int price;
	
	//we can generate hashcode and equals by IDE same as getter and setter methods
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lap other = (Lap) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}

  //we can generate toString method as well by IDE same as getters and setters
	public String toString() { //if we create toString method here it will overrite from object class and print this method value.
		//return "Hi";
		return model + ":" + price;
	}
}

public class BasicDemoObjectClass {

	public static void main(String[] args) {
		
		Lap obj1 = new Lap();
		obj1.model="hp";
		obj1.price=100;
		//System.out.println(obj);
		
		Lap obj2 = new Lap();
		obj2.model="hp1";
		obj2.price=100;
		
		boolean result = obj1.equals(obj2); //to check if the values are equal or not
		
		//System.out.println(obj.toString()); //by default it will call toString method from object class
		System.out.println(result);
	}

}
