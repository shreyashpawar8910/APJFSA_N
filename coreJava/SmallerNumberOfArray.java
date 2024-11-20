
// Q) Create Java Program to print the smallest element in an array.



package coreJava;


public class SmallerNumberOfArray {	

	/*

 		Functionality of this method

 		step 1: Declare and initialise the array
 		step 2: Find out the smallest element of the array
 		step 3: Print the smallest element of the array

	 */

	public static void main(String[] args) {
		
		// Declare and initialise the array
		int arr[] = {45,12,35,47,69,58,11};

		// Declare and set the value of first element of array to the smallNumber variable
		int smallNumber = arr[0];
		
		
		// Create for loop for itterating each element of array
		
		for(int i = 0; i < arr.length; i++) {
			
			// Check the smallest element of the array
			if(smallNumber > arr[i]) {
				
				// Assign the smallest value to the smallNumber variable
				smallNumber = arr[i];
				
			}
			
		}
		
		System.out.println("Smallest Number of the Array : "+smallNumber);
	}

}


/*
 
  	Output :-
  	
  	Smallest Number of the Array : 11

  
*/

