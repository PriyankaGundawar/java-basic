package com.priyabasic;

enum Status{ //Status is a class, it has all the response status when we submit request to server
	Running, Failed, Stopped, Success, Pending; // these are objects
}
public class BasicDemoEnumaration {

	public static void main(String[] args) {
		
		//Status s = Status.Success;
		//System.out.println(s); //getting particular status
		//System.out.println(s.ordinal()); //index values
		
		//Status[] ss = Status.values(); //if we want to print all we need to use values(), it will return array.
		//System.out.println(ss); //it will return address
		//System.out.println(ss[0]); //returns particular value
		//we need to use for loop for printing all values
		
//		for (Status p: ss) {
//			System.out.println(p);
//		}
		
		//we can use for loop as well
		/*Status s = Status.Pending;
		
		if(s==Status.Running)
			System.out.println("running");
		else if(s==Status.Failed)
			System.out.println("try again");
		else if (s==Status.Pending)
			System.out.println("please wait");
		else if(s== Status.Success)
			System.out.println("all good");
		else
			System.out.println("stopped");*/
		
		//we can use switch as well
		
		Status s = Status.Success;
		switch(s) {
		case Running:
			System.out.println("running");
			break;
			
		case Failed:
			System.out.println("failed");
			break;
			
		case Pending:
			System.out.println("Pending");
			break;
			
		case Success:
			System.out.println("Success");
			break;
			
			default:
				System.out.println("stopped");
				break;
			
		
		}
			
	}

}

//we cannot extend enum with any other class.
//we can create constructors, methods in it.
//it extends enum super class
