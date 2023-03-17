package com.priyabasic;

class Student{
	int rollno;
	String name;
	int marks;
	
}

public class BasicDemoObjectArray {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.rollno=1;
		s1.name="priya";
		s1.marks=55;
		
		Student s2 = new Student();
		s2.rollno=2;
		s2.name="sai";
		s2.marks=66;
		
		Student students[] = new Student[2];
		students[0] = s1;
		students[1] = s2;
		
//		for(int i = 0; i <students.length; i++)
//		{
//			System.out.println(students[i].name + "|" + students[i].marks);
//		}
		
		for(Student stud : students)
		{
			System.out.println(stud.name);
		}
		
	}

}
