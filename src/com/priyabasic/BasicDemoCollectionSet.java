package com.priyabasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BasicDemoCollectionSet {

	public static void main(String[] args) {
		
		//Collection<Integer> nums = new HashSet<Integer>();
		Collection<Integer> nums = new TreeSet<Integer>();
		//Set<Integer> nums = new HashSet<Integer>(); //we can use Collection or Set.
		nums.add(9); //these are the objects.
		nums.add(6);
		nums.add(8);
		nums.add(1);
		//nums.add(9);
		
		
		//System.out.println(nums); //it will print complete array.
		
		
		Iterator<Integer> in = nums.iterator(); //we have iterator to get all the values or instead of for loop.
		
		while(in.hasNext()) //prints all values
		System.out.println(in.next());
		
		//to get one by one value we can use for loop.
//		for (int n :nums) { //while getting the value we need to mention type.
//			System.out.println(n);			
//		}
		
	}

}

//we cannot have duplicate values in HashSet, if we have also it will return any one of the value.
//it will not return the values in order or not in sorted order. returns random values.
//HashSet does not return index values.

//Treeset will restur sorted value as it extends the class of SortSet.
