package com.priyabasic;

class Th{
	//public void show() { //handing the exception here
		public void show() throws ClassNotFoundException { //we are throwing exception to main method below and not writing any try catch here.
//		try {
//			Class.forName("BasicDemo");
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println("class not find");
//		}
		
		Class.forName("BasicDemo");
		
	}
}
public class BasicDemoExceptionHandlingThrows {
	static {
		System.out.println("class loaded");
	}

	public static void main(String[] args) {
		
		Th obj = new Th(); //IDE will generte try catch blocks.
		try { //above class throwing the error and here we are writing try catch blocks.
			obj.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


