
// Program for create Bean class for Employee details

package coreJava;

import java.io.Serializable;


//***** Create Bean Class and import serializable interface *******

class Demo implements Serializable{
	
	
	// Declaring the private variables 
	int empId;
	String empName;
	int empAge;
	double empSalary;
	
	
	// Creating Default Constructor
	public Demo(){
				
	}

	
	// Generate Getter and Setter methods 
	
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


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	
	
	
}

public class JavaBeanEmployee {

	public static void main(String[] args) {

		// Creating an object of Bean class
		Demo obj = new Demo();
		
		// Setting value into variable using setter method
		obj.setEmpId(1);
		obj.setEmpName("Shreyash Pawar");
		obj.setEmpAge(22);
		obj.setEmpSalary(10000.10);
		
		
		// Print value of variable using getter method
		System.out.println("Employee Id : "+obj.getEmpId());
		System.out.println("Employee Name : "+obj.getEmpName());
		System.out.println("Employee Age : "+obj.getEmpAge());
		System.out.println("Employee Salary : "+obj.getEmpSalary());
		
	}

}



/*
 
 	Output : 
 	
 	Employee Id : 1
	Employee Name : Shreyash Pawar
	Employee Age : 22
	Employee Salary : 10000.1
 
*/