package com.priyabasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicDemoTryFinally {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		int num = 0;
   
//     int i=1;
//     int j =0;
//     try {
//    	 j = 13/i;
//     }
//     catch(Exception e) {
//    	 System.out.println("something went wrong");
//     }
//     finally {
//    	 System.out.println("bye"); //irrespective of exception in try block finally will get exeuted.
//     }
		BufferedReader bf= null;
		try {
        //InputStreamReader in = new InputStreamReader(System.in);
		//bf = new BufferedReader(in);
		bf = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(bf.readLine());
		}
		finally {
			bf.close(); //it will give error. we need to define br outside of try.
		}
	}

}

//basically finally keyword is used to close the resources(DB connection, network connection, file etc...)