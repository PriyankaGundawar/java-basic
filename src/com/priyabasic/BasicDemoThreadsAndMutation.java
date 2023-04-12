package com.priyabasic;

class Count{
	Integer cnt =0;
	public synchronized void inc() { //synchronized will call one method at a time. 
		cnt=cnt+1;
	}
}
public class BasicDemoThreadsAndMutation {

	public static void main(String[] args) throws InterruptedException {
		
		Count c = new Count();
      Runnable ob1 = ()  ->
    		  {
    			for(int i=1;i<=50000;i++) {
    				c.inc();
    				
    			}
    			
    		  };
      Runnable ob2 = () ->
    		  {
    			  for(int i=1; i<=500; i++) {
    				  c.inc();
    			  }
    		  };
      
      Thread tt1 = new Thread(ob1);
      Thread tt2 = new Thread(ob2);
      tt1.join();
      tt2.join();
      tt1.start();
      tt2.start();
      
      System.out.println(c.cnt + "from main");
	}

}

//chnaging the value of variables is called mutation.

/*in above ex, we are creating two threads, one varibale and one method which increaments the value of variable.
if we are calling same method in two threads, the expected value(count) will differ. 
so we caanot use threads with mutations.
to use same variable in two threads we need to use 'synchronized' keyword in method.
so that method will call once at a time. it will call in thread one and then everything finishes then it will get called in second thread.

Sleep(), join() also will vary the results.
*/