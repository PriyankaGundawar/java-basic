package com.priyabasic;

@FunctionalInterface //contains only one method in it
interface Fi{
	void show();
	//void m1(); if we another method, it will give error
}

//class Fc implements Fi{
//	public void show(){
//		
//		System.out.println("in show");
//	}
//}
public class BasicDemoFunctionalInterface {

	public static void main(String[] args) {
		
		//Fc obj = new Fc();
		Fi obj = new Fi() //instead of creting new class we can use annonymous object here.
				{
			public void show() {
				System.out.println("in show");
			}
				};
		obj.show();
	}

}

//FunctionalInterface contains only one method. we have use by providing annotation @FunctionalInterface
