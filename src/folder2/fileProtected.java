package folder2;

import folder.Demo;

class A extends Demo {
	   public void m1() {
		A obj = new A();
	    int res = obj.gift;	
	    System.out.println(res); 
	   }
}

public class fileProtected{

public static void main(String[] args) {
	
	A obj1 = new A();
	//System.out.println(obj.gift); 
	obj1.m1();
}
}

//gift variable is protect and able to access outside the package as we are inheriting the Demo class from other package.
