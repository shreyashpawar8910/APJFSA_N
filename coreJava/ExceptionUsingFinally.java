
// Q) Write Java Exception Handling program  using finally block.


package coreJava;


public class ExceptionUsingFinally {


	/*
	 	Functionality of this method

	 	step 1:- This method used to demonstrate exception handling with using finally block

	 */	
	public static void main(String[] args) {


		// Declare an array

		int arr[] = {10,20,35,45,78,14};


		// Create an try block to perform operations on array

		try {

			System.out.println("Array value : "+arr[6]);

		}

		// Create an catch block to handle exception
		// Catch an Parent class type of exception i.e Exception
		catch (Exception e) {                                 

			// Print an exception
			System.out.println("Exception Occurs due to "+e);

		}

		// Declare an finally block
		// This block always executes
		finally {

			System.out.println("This is Finally Block");

		}

	}

}




/*

  		Output :-

  		Exception Occurs due to java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
		This is Finally Block

 */


