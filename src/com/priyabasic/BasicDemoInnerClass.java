package com.priyabasic;

class G{
	int marks;
	public void show() {
		System.out.println("In show");
	}
	
	//class H{ //class inside class called inner class
		static class H{ //static class. only inner class can be static. not outer class.
		public void config() {
			System.out.println("In config");
		}
	}
}

public class BasicDemoInnerClass {

	public static void main(String[] args) {
		
		G obj = new G();
		obj.show();
		//obj.config(); we cannot call inner class method directly. it will give error.
		
		//H obj1 = new H(); // we cannot directly create inne class objcet
		//G.H obj1 = obj.new H(); //same as we call methods and variable, we have to create object.(mainclass.innerclass)
		G.H obj1 = new G.H(); //if we create inner class as static class we can directlt create object using "." with outer class.
		obj1.config();
		
	}

}
