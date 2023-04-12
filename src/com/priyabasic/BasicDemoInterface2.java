package com.priyabasic;

interface In1{ //contains all the abstract methods
	 void show(); 
	 void display();
}

interface In2{
	void run();
}

interface In3 extends In2{ //we can extend the other interface.  it contains same method.
	
}
class Cl1 implements In1,In2{  //can implement multiple Interfaces
	
	public void show() {
		
		System.out.println("In show");
	}
	
	public void display() {
	
		System.out.println("In display");	
	}
	public void run() { //must impelement the method
		
		System.out.println("running..");	
	}
	
}
public class BasicDemoInterface2 {

	public static void main(String[] args) {
	
		In1 obj; 
		obj = new Cl1(); 
		obj.show();
		obj.display();
		
		In2 obj1 = new Cl1(); //new create ref of another interface
		obj1.run(); //we cannot call run method directly.
		
	}

}

//class - class --> extends
//class - interface --> implements
//interface - interface --> extends
