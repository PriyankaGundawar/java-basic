package com.priyabasic;

enum Laptops{ 
	Mac(1500), lenovo(1000), hp; //objects
	
	private int price;
	

	private Laptops() { //default constructor to print the hp value as we did assigned value initially
		price = 500; //this constructor will call for non parameterized objects.
		
	}
    //directly we cannot assign value above, so we need to create constructor of price.
	private Laptops(int price) {
		this.price = price;
		System.out.println(this.name()); //this constructor will call how many parameterized objects we have.
	}
	
   //setters or getters to get the price
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
public class BasicDemoEnumaration2 {

	public static void main(String[] args) {
		
//		Laptops l = Laptops.Mac;
//		System.out.println(l);
		
		//for printing all values
		Laptops[] l = Laptops.values();;
		for (Laptops lap : l) {
			System.out.println(lap + ":" + lap.getPrice());
		}
	}

}


