package com.priyabasic;

class L {
	public void show() {
		System.out.println("In L show");
	}
}

class M extends L{
	public void show() {
		System.out.println("In M show");
	}
}

class N extends L{
	public void show() {
		System.out.println("In N show");
	}
}

public class BasicDemoPolymorDynamicdispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		L obj = new L();
		//L obj = new M(); //ref of parent but object of child
		obj.show();
		
		obj = new M();
		obj.show();
		
		obj = new N();
		obj.show();
	}

}

//same ref but it behaves different when creating object of other class called polymorphism
//same thing which behaves differently in different situations.(works when we inherits some class)
