
/*
 	  Que) Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing 
 	  		elements in an array.[Hint: Use array and loop and try to access the element beyond the last index]
 */

package coreJava;

public class ThrowsArrayOutOfBond {

	/*
	 Functionality of This Method :-

	 Step 1: Get array as a parameter
	 Step 2: Throws ArrayOutOfBoundException with Method signature
	 Step 3: Write for loop for print array values at the time of length+1. Which occure ArrayOutOfBoundException
	 */

	public static void printArray(int arr[]) throws ArrayIndexOutOfBoundsException{

		for(int i = 0; i<arr.length+1; i++) {       // arr.length+1 occure Exception
			System.out.println(arr[i]);
		}

	}


	public static void main(String[] args) {

		// Declare an Array
		int arr[] = {10,20,30,40,50};

		// Call an static method and pass array as a parameter
		printArray(arr);

	}

}



/*

  	Output :-

  	10
	20
	30
	40
	50
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		at APJFSA_Assignments/coreJava.ThrowsArrayOutOfBox.printArray(ThrowsArrayOutOfBox.java:9)
		at APJFSA_Assignments/coreJava.ThrowsArrayOutOfBox.main(ThrowsArrayOutOfBox.java:19)


 */