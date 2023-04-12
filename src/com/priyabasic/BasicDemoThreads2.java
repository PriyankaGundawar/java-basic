package com.priyabasic;

class Th3 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Hi");
		try {
			Thread.sleep(10); //will take in milliseconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Th4 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class BasicDemoThreads2 {

	public static void main(String[] args) {
      Runnable obj1 = new Th3();
      Runnable obj2 = new Th4();
      
      Thread t1 = new Thread(obj1);
      Thread t2 = new Thread(obj2);
      t1.start();
      t2.start();
	}

}

//Thread class will implements the Runnable class. so we can either extenfds the Thread class or implement the Runnable interface.
//if we implements the Runnable interface it doesn't hvae start(). so we have to create reference object of Runnable interface.
//and we need to create object of Thread and pass the Runnable interface reference variable.