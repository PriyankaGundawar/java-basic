package com.priyabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1> { //need to pass Student1 class name to interface.
	int age;
	String name;
	
	
	
	public Student1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}


	public int compareTo(Student1 that) { //it is unimplemented method of Comparable interface. we need to implement otherwise it will giveerror.
		if(this.age > that.age)
			return 1;
		else 
			return -1;
	}
	
}

public class BasicDemoCollectionSorting3 {

	public static void main(String[] args) {
		
		//writing customized logic to compare age
		Comparator<Student1> com = (i, j)  -> i.age > j.age ? 1 : -1;
//		{
//				if(i.age>j.age)
//					return 1;
//				else 
//					return -1;
//		};			
		
		List<Student1> stud = new ArrayList<>();
		stud.add(new Student1(23,"priya"));
		stud.add(new Student1(15,"Riya"));
		stud.add(new Student1(32,"Sai"));
		stud.add(new Student1(46,"Ram"));
		
		//Collections.sort(stud);  //directly we cannot sort.
		//Collections.sort(stud,com);  //if we dont pass com it wont work. we can use Coparable interface.
		Collections.sort(stud); //if we use Comparable interface then we can directly sort
		
		//System.out.println(stud);
		
		for (Student1 s : stud) {
			System.out.println(s);
		}
		
		
	}

}

//Collections is class and sort is a method to sort the values.(it has its own logic to sort).
