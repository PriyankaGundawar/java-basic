package com.priyabasic;

public class BasicDemoStringBuff {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("priya");
		sb.append(" g"); // appending data to stringbuffer
		//String str =sb.toString(); // to convert stringbuffer to string
		//sb.deleteCharAt(3); // to delete the chars
		sb.insert(0, "Sai");
		System.out.println(sb);
	}

}

