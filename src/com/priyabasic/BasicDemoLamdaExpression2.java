package com.priyabasic;

//Lambda expression is used to minimize the code. it will work with only Functional Interface.

@FunctionalInterface
interface Le2{
	public int show(int i, int j);
}
public class BasicDemoLamdaExpression2 {

	public static void main(String[] args) {
 
//		Le2 obj = new Le2(){
//			public int show(int i, int j) {
//				return i+j;
//				
//			}
//		};
		
		//Le2 obj = (int i, int j) ->  i+j; //no need to keep return as well
		Le2 obj = (i, j) ->  i+j;	  //no need to keep type as well, as we have already provided above
		int res = obj.show(2,3);
		System.out.println(res);
		
	}

}

//-> - is lamda expression
//also it will not create annonymous class file when we compile, so we can save coding and memory as well.
