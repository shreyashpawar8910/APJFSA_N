
// Q)  Write a Java Program  to pass  this keyword as argument in the constructor call.


package coreJava;


// Creating an class Class1

class Class1{

	// Create an Parameterised Constructor which 
	// Constructor accept parameter as a object of class2

	Class1(Class2 obj) {

		// Printing instance variable's value in Class1's Constructor using 'obj' object
		// We can access variable of class2   i.e int a;

		System.out.println("Into Constrctor Value of A : "+obj.a);			

	}

}

class Class2 {

	// Declaring an instance variable 

	int a = 10;

	// Declaring an display method

	void display() {


		// Creating an object of Class1 and pass object of current class as a parameter using this keyword 

		Class1 cls = new Class1(this);

		// Printing some message
		System.out.println("This is Display method of Class2");

	}

}


public class ThisConstructorCall {

	public static void main(String[] args) {

		// Create an object of Class1
		Class2 object = new Class2();

		// Calling display() method of class2
		object.display();

	}

}


/*

 	Output :-
 	
 	Into Constrctor Value of A : 10
	This is Display method of Class2

 
 
*/

