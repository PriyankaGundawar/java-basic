package com.priyabasic;

class P{
	
	public P() {
		System.out.println("object created");
	}
	
	public void pShow() {
		System.out.println("in show");
	}
}
	

public class BasicDemoAnonymsObject {

	public static void main(String[] args) {
		
		//P obj = new P();
		//obj.pShow();
		new P().pShow(); //object with no name or no reference variable is called anonymous object.
		//we cannot reuse the object.
		new P(); //everytime it creates the object.that mean we cannot reuse it.
	}

}

