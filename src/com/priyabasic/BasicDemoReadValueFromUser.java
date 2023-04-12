package com.priyabasic;

import java.io.IOException;

public class BasicDemoReadValueFromUser {

	public static void main(String[] args) throws IOException {
     System.out.println("Rnter a number"); //println method is of class PrinCLass.
     int num = System.in.read(); //this method is used to read the value from console. it thows error.
     System.out.println(num - 48);
	}

}

//the read method throws error. either we need to write try catch or need to add throws IOException in main.
//the read method prints ASCII value. if we enter 5, it will print 53. ASCII value of zero is 48.
//read method takes only single character. so we need to use BufferedReader method.