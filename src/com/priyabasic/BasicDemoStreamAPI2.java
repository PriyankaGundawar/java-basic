package com.priyabasic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BasicDemoStreamAPI2 {

	public static void main(String[] args) {
     
		List<Integer> nums = Arrays.asList(5,7,9,3,2,1,6); //instead of adding the values using add(), we can directly add here.
		
//		for earch method inplements Consumer method internally.
//	    Consumer<Integer> con = new Consumer<Integer>() { //Functional Interface.
//	    	
//			public void accept(Integer n) { //takes Integer value
//            
//				System.out.println(n);
//			}
//	    
//	    };
//	    
//	    nums.forEach(con); //for earch method inplements Consumer method internally.
		
	    
//	    Consumer<Integer> con = n  -> System.out.println(n); //using lambda exp we can use directly this
//		nums.forEach(con); //for earch method inplements Consumer method internally.

		
		nums.forEach(n -> System.out.println(n)); //simplyfying above we can directly use this one line to print all values.
		
		
		

		
	}

}
