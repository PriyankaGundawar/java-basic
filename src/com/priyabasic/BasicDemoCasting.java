package com.priyabasic;

class D{
	public void show1() {
		System.out.println("In A show");
	}
}

class E extends D{
	public void show2() {
		System.out.println("In B show");
	}
}

public class BasicDemoCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	   double d = 2.3;
//	   int i = (int)d; //casting double to int. we may decimal loose data here
//		System.out.println(i);
		
		D obj = new E(); //upcasting. creating object of child but reference of parent class.
		obj.show1();
		//obj.show2(); // we cannot call child class method as ref is parent class
		
		E obj1 = (E)obj; //down casting. creating reference of child class and assigning parent reference variable.
		obj1.show2();
		
	   }

}
