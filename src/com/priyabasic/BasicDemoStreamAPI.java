package com.priyabasic;

import java.util.Arrays;
import java.util.List;

public class BasicDemoStreamAPI {

	public static void main(String[] args) {
     
		List<Integer> nums = Arrays.asList(5,7,9,3,2,1,6); //instead of adding the values using add(), we can directly add here.
		
		//System.out.println(nums); //it gives array
		
		
//		for (int i=0; i<nums.size(); i++) { //return all the values one by one
//			System.out.println(nums.get(i));
//		}
		
		
//		for (int n : nums) { //return all the values one by one
//		System.out.println(n);
//	}
		
		
		//if we want to perform some operation.		
//		int sum=0;
//		for(int n : nums) {
//			if(n%2==0) {
//				n=n*2;
//				sum=sum+n;
//			}			
//		}
//		System.out.println(sum);
		
		nums.forEach(n -> System.out.println(n)); //we can use forEach() to print all the values.
	}

}
