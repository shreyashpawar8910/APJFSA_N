// Que) Write a Java program to remove all elements from a hash set. 


package coreJava;

import java.util.HashSet;

public class HashSetRemoveElement {

	/*
	 	Functionality of this Method :-

	 	Step 1: Create an HashSet
	 	Step 2: Insert Elements into HashSet
	 	Step 3: Display Elements of HashSet
	 	Step 4: Remove all Elements of HashSet
	 	Step 5: Display again HashSet
	 */
	public static void main(String[] args) {

		// Create an Object of HashSet
		HashSet<String> hsSet = new HashSet<>();


		// Insert Elements into HashSet		
		hsSet.add("Shreyash");
		hsSet.add("Krunal");
		hsSet.add("Ajay");
		hsSet.add("Akash");


		// Display All Elements of HashSet Before Removing

		System.out.println("HashSet Before Removing Elements : ");
		System.out.println(hsSet);


		// Removing all elements from HashSet
		hsSet.clear();

		// Display All Elements of HashSet After Removing
		System.out.println("\nHashSet After Removing Elements : ");
		System.out.println(hsSet);

	}

}


/*
 		Output :-

 		HashSet Before Removing Elements : 
		[Krunal, Akash, Shreyash, Ajay]

		HashSet After Removing Elements : 
		[]


 */
