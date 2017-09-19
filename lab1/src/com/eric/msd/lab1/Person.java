/*
The Following program is for Mobile Programming - Lab 1
Author: Eric Strong
Date: 16/09/2017

PART1: a: there is only 1 method. The Constructor is not a method. it is a special type of method. but not a method. as all methods have
a return type. 

PART2: b: There are 2 attributes String name and char gender. 

*/

package com.eric.msd.lab1;

public class Person{
	private String name;
	private char gender;

	//default Constructor
	public Person(){
	}
	
	//Constructor
	public Person(String name, char gender){

		//PART2 : a
		this.name = name;
		this.gender = Character.toUpperCase(gender);
	}//end constructor

	public String toString(){
		String str = "The person is:  ";
		str += name + " \nwho is : ";
		if(gender == 'M'){
			str += " Male";			
		}//end if
		else if (gender == 'f'){
			str += " Female";
		}//end else if
		else {
			str += "unknown";
		}

		return str;

	
	}//end toString method

}//end class