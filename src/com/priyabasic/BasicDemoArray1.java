package com.priyabasic;

public class BasicDemoArray1 {

	public static void main(String[] args) {
		//int arr[] = {9,7,5,3}; //array with values assigned while creating
		int arrdy[] = new int[4]; //creating array with defining size
		arrdy[0] = 5; // assigning the values to indexes - index starts with zero
		arrdy[1] = 4;
		arrdy[2] = 6;
		arrdy[3] = 8;
		
		for(int i = 0; i < 4; i++) { // getting all the values in array
		System.out.println(arrdy[i]);
		}
		
		System.out.println(arrdy[1]); // getting the particular index values from array
	}

}
