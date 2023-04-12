package com.priyabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicDemoCollectionSorting {

	public static void main(String[] args) {
		
		//custom sorting. we have to use comparator interface.
		//basically we are writing logic to sort the values based on last digit.
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) { //it takes two Integer parameters
				if(i%10 > j%10) //logic based on our req.
				return 1; //swap
				else
					return -1; //it wont swap
				
			}
			
		};
		
		
		List<Integer> nums = new ArrayList<>();
		nums.add(29);
		nums.add(56);
		nums.add(25);
		nums.add(78);
		
		//Collections.sort(nums);//it is a class to sort the values
		Collections.sort(nums,com);
		System.out.println(nums);
		
	}

}

//Collections is class and sort is a method to sort the values.(it has its own logic to sort).
