package com.priyabasic;

interface Computer{
	public abstract void code();
}

class Laptop implements Computer{
	public void code() {
		System.out.println("code, compile..");
	}
}

class Desktop implements Computer{
	public void code() {
		System.out.println("Enhanced code, compile..");
	}
}


class Developer{
	public void dev(Computer lap) { 
		//System.out.println("coding");
		lap.code();
	}
}
public class BasicDemoInterface3 {

	public static void main(String[] args) {
	    Computer lap = new Laptop();
	    Computer desk = new Desktop();
		Developer obj = new Developer();
		obj.dev(desk); //it should accept either laptop or desktop
	}

}
