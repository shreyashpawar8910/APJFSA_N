
// Que) Write a Java program to implement Comparable Interface that sort the age of employee [EmpId, ImpName, ImpAge]


package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Create an Employee Class and implements Comparable Interface

class Employee1 implements Comparable<Employee1>{

	/*
	 	Functionality of this Class

	 	Step 1: Declare Variables for store Employee's Data
	 	Step 2: Generate Parameterised Constructor & Getters, Setters
	 	Step 3: Declare compareTo() method for Sort List data using Comparable interface 
	 */



	// Declare Variables 

	int empId;
	String empName;
	int empAge;

	// Declare Parameterised Constructor

	public Employee1(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}


	// Generate Getter & Setters

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	// Declare compareTo() Method for comparing Employee Age  (Note :- It will be automatically called by Collections.sort() method)

	public int compareTo(Employee1 e) {

		if(this.empAge > e.empAge) {
			return 1;
		}
		else {
			return -1;
		}

	}

}


public class ComparableInterfaceEmployee {

	public static void main(String[] args) {

		/*
		 	Functionality of this Method

		 	Step 1: Create an Object of Arraylist
		 	Step 2: Add Objects of Employee Class and call parameterised Constructor
		 	Step 3: Call Collections.sort() method and pass object of Arraylist. (It automatically call compareTo() Method of Employee class)
		 	Step 4: Display Updated Class's Object
		 */


		// Create Object of Arraylist 
		List<Employee1> obj = new ArrayList<>();

		// Add Objects into Arraylist
		obj.add(new Employee1(1, "Shreyash", 21));
		obj.add(new Employee1(2, "Krunal", 27));
		obj.add(new Employee1(3, "Ram", 25));


		// Call Sort() method 
		Collections.sort(obj);

		// Display Updated Class's Data 
		for(Employee1 e : obj) {

			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpAge());

		}

	}
}


/*

  	Output :- 

  	1 Shreyash 21
	3 Ram 25
	2 Krunal 27


 */
