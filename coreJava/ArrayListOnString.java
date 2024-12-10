package coreJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOnString {


	/*
 		Functionality of this Method :-

 		Step 1: Create an ArrayList of Sting Data type
 		Step 2: Add Strings into ArrayList using .add() method
 		Step 3: Perform multiple operation on ArrayList using Predefined Methods
	 */
	public static void main(String[] args) {

		// Importing & Creating an Object of Arraylist
		List<String> list = new ArrayList<>();

		// Add Values into ArrayList
		list.add("Shreyash");
		list.add("Ram");
		list.add("Krunal");
		list.add("Ajay");

		System.out.println("Array List Elements :-"+list);

		// Add Sting into particular index position
		list.add(1, "Tejas");
		System.out.println("After Adding New Element Array List :-"+list);

		// Creating an Second ArrayList
		List<String>list2 = new ArrayList<>();
		list2.add("Java");
		list2.add("CPP");
		list2.add("HTML");
		list2.add("CSS");


		// Add Second ArrayList into First ArrayList using addAll() method
		list.addAll(list2);
		System.out.println("First ArrayList and Second ArrayList Combine :-"+list);

		// Remove particular element of the ArrayList 
		list.remove(1);
		System.out.println("After Removing Array List :-"+list);

		// Set / Update ArrayList 
		list.set(1, "Vikas");
		System.out.println("After Updating Array List :-"+list);
	}

}



/*

 		Output :-
		
		Array List Elements :-[Shreyash, Ram, Krunal, Ajay]
		After Adding New Element Array List :-[Shreyash, Tejas, Ram, Krunal, Ajay]
		First ArrayList and Second ArrayList Combine :-[Shreyash, Tejas, Ram, Krunal, Ajay, Java, CPP, HTML, CSS]
		After Removing Array List :-[Shreyash, Ram, Krunal, Ajay, Java, CPP, HTML, CSS]
		After Updating Array List :-[Shreyash, Vikas, Krunal, Ajay, Java, CPP, HTML, CSS]


 */


