package com.priyabasic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BasicDemoStreamAPI5 {

	public static void main(String[] args) {
     
		List<Integer> nums = Arrays.asList(5,8,9,3,2,1,6); 
		//How the filter, map and redurec will work.
		
//		Predicate<Integer> p = new Predicate<Integer>() { //Functional interface
//			public boolean test(Integer n) {
//				return n%2==0;
//			}			
//		};
		
		//simplified code using lambda exp.
		//Predicate<Integer> p = n ->  n%2==0;

//		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//			public Integer apply(Integer n) {
//				return n*2;
//			}			
//		};
		
		//simplified code using lambda exp.
		//Function<Integer, Integer> fun = n -> n*2;		
		
		//int res = nums.stream()
			//.filter(n -> n%2==0) //filter needs object of predicate interface and it is Functional Interface.
			//.filter(p) //it will work using above predicate implementation
			
			//.map(n ->n*2) //map needs object of Function interface and it is functonal interface.
			//.map(fun) //it will work using above Function implementation
			
			//.reduce(0,(c,e) -> c+e); //it will give reduced results(any operation). it takes 0 as initial value to add. c-carry, e-element.
		//System.out.println(res);
		
		//if we want sorted values
		Stream<Integer> sortedValues = nums.stream()
		.filter(n -> n%2==0)
		.sorted();
		
		sortedValues.forEach(n ->System.out.println(n));
		
		
		
	}

}
