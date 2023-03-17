package com.priyabasic;

public class BasicDemoArray2more {

	public static void main(String[] args) {
		int arrdy[] = new int[7];
		arrdy[0] = 5; 
		arrdy[1] = 4;
		arrdy[2] = 6;
		arrdy[3] = 8;
		
		for(int i = 0; i < arrdy.length; i++) { // if we don't know the size of array then we can specify array name.lenth
		System.out.println(arrdy[i]); // if we dont assign the values to array by default it will take zero values
		}
		
	}

}
