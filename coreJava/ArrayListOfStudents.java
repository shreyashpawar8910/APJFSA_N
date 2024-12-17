
// Que) Create a Student class and create an array list to add 10 student objects and print them using a for each loop.

package coreJava;

import java.util.ArrayList;



class Student {

	/*
	 	Functionality Of this Class 

	 	Step 1: Declare an Private Variables & Parameterised Constructor
	 	Step 2: Get Values using parametes and assign to the local variable 
	 	Step 3: Declare toString() Method to return Local variable values as a String format
	 */

	// Dedclaring a Local Variable
	int roll;
	String name;

	// Declaring Parameterised Constructor 
	Student(int roll, String name) {

		this.roll = roll;
		this.name = name;

	}


	// Declare toString Method for return Local Variable Value as a String Format
	public String toString() {

		String convertString = "Roll : "+this.roll+" Name : "+this.name;

		return convertString;
	}

}


public class ArrayListOfStudents {

	public static void main(String[] args) {

		// Creating an Object of ArrayList
		ArrayList<Student> arrayList = new ArrayList<>();

		// Add Objects of Student Class into Arraylist
		arrayList.add(new Student(1, "Shreyash"));
		arrayList.add(new Student(2, "Krunal"));
		arrayList.add(new Student(3, "Ram"));
		arrayList.add(new Student(4, "Akash"));
		arrayList.add(new Student(5, "Tushar"));
		arrayList.add(new Student(6, "Shri"));
		arrayList.add(new Student(7, "Rohit"));
		arrayList.add(new Student(8, "Prathmesh"));
		arrayList.add(new Student(9, "Dhananjay"));
		arrayList.add(new Student(10, "Atharva"));


		// Display Elements of Arraylist Using For Each loop 
		for(Student std : arrayList) 
		{ 
			System.out.println(std.toString()); 
		}

	}

}


/*

 	Output :-

 	Roll : 1 Name : Shreyash
	Roll : 2 Name : Krunal
	Roll : 3 Name : Ram
	Roll : 4 Name : Akash
	Roll : 5 Name : Tushar
	Roll : 6 Name : Shri
	Roll : 7 Name : Rohit
	Roll : 8 Name : Prathmesh
	Roll : 9 Name : Dhananjay
	Roll : 10 Name : Atharva


 */

