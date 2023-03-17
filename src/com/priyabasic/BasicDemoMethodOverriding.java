package com.priyabasic;

class Ncal{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public void show() {
		System.out.println("some");
	}
}	
	

class Acal extends Ncal{
	public int add(int n1, int n2) { //method overriding.
		return n1+n2+2;
	}
}


public class BasicDemoMethodOverriding {

	public static void main(String[] args) {
		
		Acal obj = new Acal();
		int res = obj.add(2, 3);
		obj.show();
		
		System.out.println(res);
	}

}

//if we have same methods in both class and child class parent class , whatever the calculation given child class it will executes
// if we do not have any calculations in child class it will execute method in parent class.
