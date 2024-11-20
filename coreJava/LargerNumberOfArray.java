
// Q) Create Java Program to print the largest element in an array

package coreJava;

public class LargerNumberOfArray {


	/*
	 	Functionality of this  method

	 	step 1: Declare an array and initialise it.
	 	step 2: Find out the largest number of the array

	 */
	public static void main(String[] args) {


		// Initialise the array
		int arr[] = {10,54,7,14,35,45};

		// Declare an variable for store large number of array
		int largeNumber = 0;


		// For loop for itterating on each value of the array
		for(int i = 0; i < arr.length; i++) {

			// Check the condition compare the each value of array with largerNumber variable

			if(arr[i] > largeNumber) {

				// If condition is true then assign the value of an array to largerNumber variable
				largeNumber = arr[i];

			}
		}


		System.out.println("Larger number in the array :"+largeNumber);

	}

}




/*

  	Output :-

  	Larger number in the array :54


 */