package com.priyabasic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class BasicDemoCollectionMap {

	public static void main(String[] args) {
				
		Map <String, Integer> student = new HashMap<>(); //Map is key value pair
		//Map <String, Integer> student = new Hashtable<>();
		student.put("priya", 55);
		student.put("Riya", 66);
		student.put("Sai", 49);
		student.put("Riya", 88);
		
		//System.out.println(student); //we can get all the data
		System.out.println(student.keySet()); //we get the keys here
		
		//to get the data one by one
		for (String key : student.keySet()) { //looping keyset value to get one by one results.
			System.out.println(key + ":" + student.get(key)); //getting key and(+) value of key.
		}
		
	}

}

//key is set which does not take duplicate values.
//Value is list.

//we can use HashTable which is synchronized table. it can be used with multiple threads.
//Hashtable and HashMap almost works same.
