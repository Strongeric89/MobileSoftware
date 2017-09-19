/*
The following program is for mobile programming
PART 3: Student Class
*/
package com.eric.msd.lab1;

public class Student extends Person implements PublishDetails{
	public String studentId;
	public String courseCode;
	public static int uniqueNo = 0;

	public Student(String name, char gender, String studentId, String courseCode){
		super(name, gender); // calling the superclass (Person's Constructor)
		this.studentId = studentId;
		this.courseCode = courseCode;
		
		uniqueNo ++;


	}//end constructor

	//PART5
	public Student(String name, char gender, String courseCode){
		super(name,gender);
		this.courseCode = courseCode;
		this.studentId = "C" + uniqueNo;
		
	}//end constructor

	public String toString(){
		String s = "";
		s += super.toString();
		s += "\nStudent Id: " + studentId;
		s += "\nCourse Code: " + courseCode;

		return s;

	
	}//end toString


	//Interface Methods Forsed to be implemented
	public void confirmDetails(){

		System.out.println(this.toString());

	}//end publishDetails


	public void getCourseCode(){
		System.out.println(this.courseCode);
		
	}//end getCourseCode


	
}//end class