package com.priyabasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicDemoReadValueFromUser2 {

	public static void main(String[] args) throws IOException {
     System.out.println("Rnter a number"); 
//     InputStreamReader in = new InputStreamReader(System.in); //it expects System.in . //need to import package as above
//     BufferedReader bf = new BufferedReader(in); //it expects InputStream. //need to import package as above
//     int num = Integer.parseInt(bf.readLine()); //bf.readline will take only String so we are converting to int using Integer.parseInt function.
//     System.out.println(num);     
//     bf.close(); //bf is resource. best practise to we need to close it.
     
     //we use Scanner as well. easy to use.
     Scanner sc = new Scanner(System.in); //it expects System.in
     int num = sc.nextInt(); //we have so many methods
     System.out.println(num);
	}

}

//the read method throws error. either we need to write try catch or need to add throws IOException in main.
//the read method prints ASCII value. if we enter 5, it will print 53. ASCII value of zero is 48.
//read method takes only single character. so we need to use BufferedReader method.