package com.priyabasic;

class AB{
	public void showData() {
		System.out.println("In A");
	}
}

class CD extends AB{
	@Override //annotation used to provide some extra information while compiling the code.
	//public void showDat() {
	public void showData() {
		System.out.println("In B");
	}
}

public class BasicDemoAnnotations {

	public static void main(String[] args) {
		
		CD obj = new CD();
		obj.showData();
	}

}

//here while overriding the methon in child if I make mistake like giving wrong spelling, 
//if we use @Override annotation it will give error at code saying we didnt provided correct name in child class.
