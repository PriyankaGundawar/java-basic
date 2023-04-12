package com.priyabasic;

//class Th5 implements Runnable{
//	public void run() {
//		for(int i=1;i<=10;i++)
//		System.out.println("Hi");
//		try {
//			Thread.sleep(10); //will take in milliseconds
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

//class Th6 implements Runnable{
//	public void run() {
//		for(int i=1;i<=10;i++)
//		System.out.println("Hello");
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

public class BasicDemoThreads3 {

	public static void main(String[] args) {
      Runnable obj1 = ()  ->
    		  {
    			for(int i=1;i<=10;i++)
    			System.out.println("Hi");
    			try {
    				Thread.sleep(10); //will take in milliseconds
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
      ;
      Runnable obj2 = () ->
    		  {
    			  for(int i=1; i<=10; i++)
    		  System.out.println("Hello");
    		  try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
    	  ;
      
      Thread t1 = new Thread(obj1);
      Thread t2 = new Thread(obj2);
      t1.start();
      t2.start();
	}

}

//As Runnable interface has only one method and it is a Functional interface we can create anyonymous object with lambda expression.