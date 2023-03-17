package com.priyabasic;

abstract class FF{
	public abstract void show();
}


public class BasicDemoAbstractAnonymousInnerclass2 {

	public static void main(String[] args) {
		
		
		FF obj = new FF() {
			public void show() { 
				System.out.println("In new show");
			}
		};
		obj.show();
		
	}

}

//implemeting abstract method of abstract class inside the object of  class.
