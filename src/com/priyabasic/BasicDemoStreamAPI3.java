package com.priyabasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicDemoStreamAPI3 {

	public static void main(String[] args) {
     
		List<Integer> nums = Arrays.asList(5,8,9,3,2,1,6); //instead of adding the values using add(), we can directly add here.
		
		Stream<Integer> s1 = nums.stream(); //Stream extends Stream call. which returns stream.
		Stream<Integer> s2 = s1.filter(n -> n%2==0); //applying some filters. which returns stream.
		Stream<Integer> s3 = s2.map(n -> n*2); //applying some logic. which returns stream.
		int rest = s3.reduce(0,(c,e) -> c+e); //using resuce method which returns some results
		
		//s3.forEach(n -> System.out.println(n)); //it will have same values as an array. 
		
		System.out.println(rest); //it will give same results that we are performing using for loop and if conditions
		
		//nums.forEach(n -> System.out.println(n));
		
		
		//if we want to perform some operation.		
//		int sum=0;
//		for(int n : nums) {
//			if(n%2==0) {
//				n=n*2;
//				sum=sum+n;
//			}			
//		}
//		System.out.println(sum);
	
//we cannot use same stream mpore than one time. to perform any operation we have use multiple stream and store intermediate results.

	}

}
