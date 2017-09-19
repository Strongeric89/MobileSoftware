/*
The following program is for mobile programing
This is part A: the main method

*/

package com.eric.msd.lab1;

public class Control{
	public static void main(String []args){

		//part 1 - will invoke the default constructor
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1);
		System.out.println(p2);

		//if the toString method was not overriden, the objects memory address would be printed

	
		//creating two Person objects
		Person p3 = new Person("Eric", 'm');		
		Person p4 = new Person("Laura", 'f');
		
		System.out.println(p3);
		System.out.println(p4);

		//After running this calls the objects toString method, Which will print out their name and gender	
		
		//PART 5: b
		Student s1 = new Student("Johno",'m', "Computer Science", "DT228");
		Student s2 = new Student("Rhianna", 'f',"Computer Science Infrastructure");
		Student s3 = new Student("Chester", 'm',"Computer Science","DT282");

		s1.confirmDetails();
		s2.confirmDetails();
		s3.confirmDetails();
		
		s1.getCourseCode();
		s2.getCourseCode();
		s3.getCourseCode();
	}//end main
	
}//end class