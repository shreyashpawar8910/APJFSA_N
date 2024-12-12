
// Que ) Write a Java program to append the specified element to the end of a HashSet.
//              [Hint:Add elements in the Set using add() method

package coreJava;

import java.util.HashSet;

public class HashSetExample {

	
	/*
 		Functionality of this Method :-
 	
 		Step 1: Creating an HashSet 
 		Step 2: Append elements into HashSet
	 */
	public static void main(String[] args) {

		// Declaring & Creating Object of HashSet 
		HashSet<Integer> hs = new HashSet<>();
		
		// Adding Elements into HashSet
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		
		System.out.println("Elements of HashSet :- "+hs);
		
		hs.add(50);
		
		System.out.println("After Appending Elements of HashSet :- "+hs);
	}

}


/*
 		Output :- 
 		
 		Elements of HashSet :- [20, 40, 10, 30]
		After Appending Elements of HashSet :- [50, 20, 40, 10, 30]

 */


