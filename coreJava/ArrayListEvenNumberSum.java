
// Que) Write a java program that calculates the sum of all even numbers present in an ArrayList of integer


package coreJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEvenNumberSum {


	/*
	 	Functionality of this Method :-

	 	Step 1: Create an ArrayList
	 	Step 2: Add integer numbers into ArrayList using .add() method
	 	Step 3: Make an addition of Even numbers present into ArrayList
	 	Step 4: Print the Addition of the Even numbers
	 */
	public static void main(String[] args) {

		// Importing ArrayList & Creating an object of Arraylist
		List<Integer> list = new ArrayList<>();

		// Adding Integer Values into ArrayList
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(6);

		// Declare variable for storing addition of the Even Numbers
		int addition = 0;


		// Calculating Even numbers sum using for loop

		/*
		 * for(int i = 0; i<list.size(); i++) {
		 * 
		 * if(list.get(i)%2==0) {
		 * 
		 * addition = addition + list.get(i);
		 * 
		 * }
		 * 
		 * }
		 */

		// Calculating Even numbers sum using forEach loop

		for (Integer i : list) {
			if(i %2==0) {
				addition = addition+i;
			}
		}

		// Print Addition of Even Numbers
		System.out.println("Addition : "+addition);


	}

}


/*

  	Output :-

  	Addition : 20



 */