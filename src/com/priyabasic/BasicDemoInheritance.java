package com.priyabasic;

public class BasicDemoInheritance {

	public static void main(String[] args) {
		//InheritanceClassB obj = new InheritanceClassB();
		InheritanceClassC obj = new InheritanceClassC();
		int res1 = obj.add(2, 3);
		int res2 = obj.sub(6, 4);
		int res3 = obj.multi(3,4);
		double res5 = obj.powr(4,2);
		
		
		System.out.println(res1 + "::" + res2 + "::" + res3 + "::" + res5);
	}

}

//multilevel inheritance it possible. herarchy will work.
//one class cannot inherits multiple class at the same time. will get ambiguity issue.