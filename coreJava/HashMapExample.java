
// Que) Write a program to add elements to the HashMap given the key as integer and value data type is String


package coreJava;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {

	/*
	 	Functionality of this Method :-

	 	Step 1: Create an HashMap 
	 	Step 2: Add elements into HashMap
	 	Step 3: Display Elements using ForEach loop
	 */

	public static void main(String[] args) {

		// Creating an Object of HashMap
		HashMap<Integer, String> hsMap = new HashMap<>();

		// Add Key & Values into HashMap
		hsMap.put(1, "Apple");
		hsMap.put(2, "Grapes");
		hsMap.put(3, "Mango");
		hsMap.put(4, "Orange");

		// Display Key & Values of HashMap using ForEach loop
		for(Map.Entry<Integer, String> entry : hsMap.entrySet()) {

			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());

		}

	}

}


/*

 	Output :- 

 	Key : 1 Value : Apple
	Key : 2 Value : Grapes
	Key : 3 Value : Mango
	Key : 4 Value : Orange

 */

