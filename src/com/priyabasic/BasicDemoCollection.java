package com.priyabasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BasicDemoCollection {

	public static void main(String[] args) {
		
		Collection<Integer> nums = new ArrayList<Integer>();
		//List<Integer> nums = new ArrayList<Integer>(); //to get index value we have to use List.
		nums.add(3); //these are the objects.
		nums.add(6);
		nums.add(8);
		nums.add(1);
		nums.add(9);
		
		
		System.out.println(nums); //it will print complete array.
		
		//to get one by one value we can use for loop.
		for (int n :nums) { //while getting the value we need to mention type.
			System.out.println(n);			
		}
		
//		System.out.println(nums.get(4)); //we can get index value. we have so many methos
//		System.out.println(nums.indexOf(8)); //it will print index value of value '6'
	}

}
//collections is extended version of Arrays. we can create dynamic size of Array.
/* we have 3 topics here. 
 * 
 * 1.Cllection API - topic
 * 2. Collection - Interface
 * 	has multiple types(List, Queue, Set)
 * 		List- linkedlist, Arraylist
 *		Queue - DeQueue
 * 		Set - Hashset, linkedhashset
 * 3. Collections - class
 */
//we cannot directly creae object of Collection Interface, so we need to any of the type.
//also when we create collection object we need to mention the type(Integer, string, float).

