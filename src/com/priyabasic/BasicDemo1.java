package com.priyabasic;

class testadd{
	public int add(int n1, int n2) {
		int result = n1 + n2;
		//System.out.println("hello");
		return result;
	}
}
public class BasicDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b= 3;
		testadd tadd = new testadd();
		int res = tadd.add(a,b);
		System.out.println(res);
	}

}
