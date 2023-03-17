package com.priyabasic;

class testaddd{
	int num = 8; //instance variable
	public int add(int n1, int n2) { //local variables
		//int result = n1 + n2;
		//System.out.println("hello");
		return n1+n2;
	}
}
public class BasicDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b= 3;
		testaddd tsadd = new testaddd();
		testaddd tsadd1 = new testaddd();
		tsadd.num = 2;
		System.out.println(tsadd.num); //calling instance variable with objectname.
		tsadd1.num=4;                  //changing the values of instance variable
		System.out.println(tsadd1.num);
	}

}