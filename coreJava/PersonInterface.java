
/* 
  Q) Create an interface called "Person" with a method called "speak". Create two classes  called "Student" and "Teacher" 
  that implement  the Person interface and implement the "speak" method. Create objects of both the Student and  Teacher 
  classes and call their respective "speak"  methods. 
*/


package coreJava;

// Create interface Person

interface Person{

	// Define speak method into interface it is abstract method
	void speak();

}


// Create Student class and implement Person interface

class Student implements Person{

	// Implement abstract method body into this class

	public void speak() {

		System.out.println("Student is Speaking.....");

	}

}


// Create Student class and implement Person interface

class Teacher implements Person{

	// Implement abstract method body into this class

	public void speak() {

		System.out.println("Teacher is Speaking.....");

	}

}


public class PersonInterface {

	public static void main(String[] args) {
		
		// Creating Object of Student class
		Student studObj = new Student();
		
		// Creating Object of Teacher Class
		Teacher teachObj = new Teacher();
		
		
		// Calling speak() method from each class using their objects
		
		// Student class speak() method
		studObj.speak();
		
		// Teacher Class speak() method
		teachObj.speak();
		

	}

}



/*

 	Output :- 
 	
 	Student is Speaking.....
	Teacher is Speaking.....

 
 
*/


