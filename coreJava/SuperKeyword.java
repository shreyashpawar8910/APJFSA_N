
// Q)  Write a Java program  to invoke parent class constructor using super keyword.


package coreJava;

// Creating an Class called Parent

class Parent{

	// Declaring an default Constructor
	Parent(){

		System.out.println("This is Constructor of Parent Class");

	}

}


// Creating an class called Child and extend class Parent in it

class Child extends Parent{


	// Declaring an Default Constructor 

	Child(){

		// Call Parent class's constructor using super(); keyword

		super();

		System.out.println("This is child class's COnstructor");
	}

}



public class SuperKeyword {

	public static void main(String[] args) {

		// Creating an Object of Child class

		Child obj = new Child();


	}

}


/*
 
  	Output :-
  	
  	This is Constructor of Parent Class
	This is child class's COnstructor

  
  
*/


