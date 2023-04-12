package com.priyabasic;

class Th1 extends Thread{
	public void run() {
		for(int i=1;i<=100;i++)
		System.out.println("Hi");
		try {
			Thread.sleep(10); //will take in milliseconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Th2 extends Thread{
	public void run() {
		for(int i=1;i<=100;i++)
		System.out.println("Hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class BasicDemoThreads {

	public static void main(String[] args) {
      Th1 obj1 = new Th1();
      Th2 obj2 = new Th2();
      obj1.start();
      obj2.start();
	}

}

//normally when we have two classes and call the method it will execute one by one.
//if we want to run both the methods simultaneously we can create threads.(we need to extend the Thread class)
//also we need to call the run method.(changing method name from show to run while defining)
//while calling method change it to start().
//we use sleep to wait the process for sometime and execute other one.
//if we use sleep method need to use try and catch(IDE will suggest and add try and catch blocks)
