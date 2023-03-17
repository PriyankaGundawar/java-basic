package com.priyabasic;

class SS{
	public void show() {
		System.out.println("In SS show");
	}
}

//class TT extends SS{ //instead of creating class here, create class after creating object.
//	public void show() {
//		System.out.println("In TT show");
//	}
//}

public class BasicDemoAnonymousInnerclass {

	public static void main(String[] args) {
		
//		SS obj = new TT();
//		obj.show();
		
		SS obj = new SS() {
			public void show() { //creating new class with no name called anonymous inner class.
				System.out.println("In new show");
			}
		};
		obj.show();
		
	}

}

//this will create .class file somename(anonymous name)
