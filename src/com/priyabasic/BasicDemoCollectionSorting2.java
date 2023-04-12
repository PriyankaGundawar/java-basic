package com.priyabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studet{
	int age;
	String name;
	
	
	
	public Studet(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Studet [age=" + age + ", name=" + name + "]";
	}
	
}

public class BasicDemoCollectionSorting2 {

	public static void main(String[] args) {
		
		//writing customized logic to compare age
		Comparator<Studet> com = (i, j)  -> i.age > j.age ? 1 : -1;
//		{
//				if(i.age>j.age)
//					return 1;
//				else 
//					return -1;
//		};			
		
		List<Studet> stud1 = new ArrayList<>();
		stud1.add(new Studet(23,"priya"));
		stud1.add(new Studet(15,"Riya"));
		stud1.add(new Studet(32,"Sai"));
		stud1.add(new Studet(46,"Ram"));
		
		//Collections.sort(stud);  //directly we cannot sort.
		Collections.sort(stud1,com); 
		
		//System.out.println(stud);
		
		for (Studet s : stud1) {
			System.out.println(s);
		}
		
		
	}

}

//Collections is class and sort is a method to sort the values.(it has its own logic to sort).
