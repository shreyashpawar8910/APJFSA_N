
// Que) Write a Java program to remove all elements from a hash set. 


package coreJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapRemoveElement {

	/*
	 	Functionality of this Method :-

	 	Step 1: Create an HashMap
	 	Step 2: Insert Elements into HashMap
	 	Step 3: Display Elements of HashMap
	 	Step 4: Remove all Elements of HashMap
	 	Step 5: Display again HashMap
	 */
	public static void main(String[] args) {

		// Create an Object of HashMap
		HashMap<Integer, String> hsMap = new HashMap<>();

		// Insert Elements into HashMap
		hsMap.put(1, "Shreyash");
		hsMap.put(2, "Krunal");
		hsMap.put(3, "Ajay");
		hsMap.put(4, "Akash");


		// Display All Elements of HashMap Before Removing

		System.out.println("HashMap Before Removing Elements : ");
		for(Map.Entry<Integer, String> entry : hsMap.entrySet()) {

			System.out.println("Key : "+entry.getKey()+" Values : "+entry.getValue());

		}

		hsMap.clear();;

		// Display All Elements of HashMap After Removing

		System.out.println("\nHashMap After Removing Elements : ");

		for(Map.Entry<Integer, String> entry : hsMap.entrySet()) {

			System.out.println("Key : "+entry.getKey()+" Values : "+entry.getValue());

		}
	}

}


/*
 		Output :-

 		HashMap Before Removing Elements : 
		Key : 1 Values : Shreyash
		Key : 2 Values : Krunal
		Key : 3 Values : Ajay
		Key : 4 Values : Akash

		HashMap After Removing Elements : 

 */


