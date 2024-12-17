
/* Que) Write a Java program to search a key in a Tree Map. 
        [Hint:create a TreeMap and add some name-age pairs to it. Then, the 
        user is prompted to enter a name to search for. If the name exists in the TreeMap, 
        the corresponding age is displayed; otherwise, a message indicating that the name was not found is shown.]
 */


package coreJava;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {


	/*
	 	Functionality of this Method

	 	Step 1: Declare an TreeMap & Add Some Name-Age Key pair values 
	 	Step 2: Check the record is present into TreeMap by using Name value
	 	Step 3: If: the given name is present in the TreeMap then Display the Age and Name]
	 			else: Print the Message is data is not present into Treemap 
	 */
	public static void main(String[] args) {

		// Declare & Create Object of TreeMap

		Map<String, Integer> treeMap = new TreeMap<>();

		// Add Data into TreeMap
		treeMap.put("Shreyash", 22);
		treeMap.put("Om", 25);
		treeMap.put("Sanket", 24);

		// Declare which name have to search into Tree
		String findingName = "Sanket";

		// Check condition is given name is present or not
		if(treeMap.containsKey(findingName)) {

			System.out.println(findingName + " " + treeMap.get(findingName));

		}else {

			System.out.println("The Given Name is not present into TreeMap");

		}

	}

}


/*
 		Output :- 

 		Sanket 24

 */


