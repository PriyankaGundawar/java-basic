package com.priyabasic;

public class BasicDemoMulDimArray2 {

	public static void main(String[] args) {
		int arrmd[][] = new int[3][]; //jagged array
		
		arrmd[0] = new int[2];
		arrmd[1] = new int[4];
		arrmd[2] = new int[3];
		//arrmd[3] = new int[2];
		
		
		for (int i = 0; i < arrmd.length; i++) {
			for (int j = 0; j < arrmd[i].length; j++) {
				arrmd[i][j] = (int)(Math.random()*10); //assigning random values to array by existing method
				//System.out.print(arrmd[i][j] + " ");
			}
			//System.out.println();
		}
		
	
		for(int n[] : arrmd) { //outer array
			for (int m : n) { //inner array
				System.out.print(m + " ");	
				
			}
			System.out.println();
		}
		
		
	}

}
