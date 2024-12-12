
// Que ) write a java program to union of two sets


package coreJava;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	
	/*
		Functionality of this Method :-
	
		Step 1: Creating an two Set
		Step 2: Create an Union of Two Set into one
		Step 3: Display the Union of the set
	 */
	public static void main(String[] args) {
		
		// Declaring & Creating an Object of Set 1
		Set<Integer> st1 = new HashSet<>();
		
		// Add Elements into Set 1
		st1.add(10);
		st1.add(20);
		st1.add(30);
		st1.add(40);
		
		// Declaring & Creating an Object of Set 2
		Set<Integer> st2 = new HashSet<>();
		
		// Add Elements into Set 1
		st2.add(10);
		st2.add(45);
		st2.add(70);
		st2.add(34);
		
		// Display Both sets 	
		
		System.out.println("Elements of Set 1 :- "+st1);
		System.out.println("Elements of Set 2 :- "+st2);
		
		//Creating an Union of Both sets into One
		st1.addAll(st2);
		
		// Display Union of two sets
		System.out.println("Union Of Sets :- "+st1);
	}

}


/*
  	Output :- 
  	
  	Elements of Set 1 :- [20, 40, 10, 30]
	Elements of Set 2 :- [34, 70, 10, 45]
	Union Of Sets :- [34, 20, 70, 40, 10, 45, 30]

 
 */


