package com.priyabasic;

//Lambda expression is used to minimize the code. it will work with only Functional Interface.

@FunctionalInterface
interface Le{
	//public void show();
	public void show(int i);
}
public class BasicDemoLamdaExpression {

	public static void main(String[] args) {
		
//		Le obj = new Le()
//				{
//			public void show(){
//				System.out.println("show");
//			}
//				};

//		Le obj = () -> //instead of writing the complete code we can use (->) expression to minimize the code.
//		{
//		System.out.println("show");
//		};	
		
//		Le obj = () ->
//		System.out.println("show"); //as we have only one statement, no need to use { } braces.
//		obj.show();
		
		//Le obj = (int i) -> System.out.println("show");
		//Le obj = (i) -> System.out.println("show"); // no need to mention type.
		Le obj = i -> System.out.println("show"); //since we have only one variable, we can use directly
				
				obj.show(5);;
	}

}

//-> - is lamda expression
//also it will not create annonymous class file when we compile, so we can save coding and memory as well.
