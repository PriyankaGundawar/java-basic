package com.priyabasic;

public class BasicDemoMulDimArray {

	public static void main(String[] args) {
		int arrmd[][] = new int[4][4]; //creating multi-dimensional array with defining size
		
		for (int i = 0; i <=3 ; i++) {
			for (int j = 0; j <=3; j++) {
				arrmd[i][j] = (int)(Math.random()*10); //assigning random values to array by existing method
				System.out.print(arrmd[i][j] + " ");
			}
			System.out.println();
		}
		
//		for(int i = 0; i <= 3; i++) { // getting all the values in outer array
//			for (int j = 0; j <= 3; j++) { // getting all the values in inner array
//		//System.out.print(arrmd[i][j] + " ");
//			}
//			System.out.println();  // to print the values of array in new line
//		}
		
		for(int n[] : arrmd) { //outer array
			for (int m : n) { //inner array
				System.out.print(m + " ");	
				
			}
			System.out.println();
		}
		
		
	}

}
