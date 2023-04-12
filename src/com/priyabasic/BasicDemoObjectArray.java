package com.priyabasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
 int age;
 String name;
 
 

public Student(int age, String name) { //creating constructor by IDE
	super();
	this.age = age;
	this.name = name;
}



public String toString() { //creating toString by IDE
	return "Student [age=" + age + ", name=" + name + "]";
}
 
	
}

public class BasicDemoObjectArray {

	public static void main(String[] args) {
		
		Comparator<Student> com = new Comparator<Student>() {			
			public int compare(Student i, Student j) {
				 if(i.age > j.age)
				return 1;
				 else 
					 return -1;
			}
			
		};
		
		List<Student> stud = new ArrayList();
		stud.add(new Student(32,"priya"));
		stud.add(new Student(25,"Riya"));
		stud.add(new Student(16,"Sai"));
		stud.add(new Student(28,"Ram"));
		
		//System.out.println(stud); //prints all the values
		
		//Collections.sort(stud); //directly we cannot sort Student object
		Collections.sort(stud,com); //we have to use Comparator interface to sort
		
		//to get the values one by one
		for (Student s : stud) {
			System.out.println(s);
		}
		
		
	}

}
