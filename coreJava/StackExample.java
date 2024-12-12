

 // Que)  Write a program to declare stack. Store 10 elements into it.Remove 4 elements from stack and display it.
 


package coreJava;

import java.util.Stack;

public class StackExample {

	/*
	 	Functionality of this Method :-
	 	
	 	Step 1: Creating an Stack 
	 	Step 2: Add 10 element into stack
	 	Step 3: Display it
	 	Step 4: Remove 4 Element among the stack element
	 	Step 5: Display it
	 */
	public static void main(String[] args) {

		// Declaring & Creating Object of Stack Class
		Stack<Integer> stk = new Stack<>();
		
		// Insert Element into Stack
		
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		stk.push(60);
		stk.push(70);
		stk.push(80);
		stk.push(90);
		stk.push(100);
		
		// Display Stack After Inserting Element into Stack
		System.out.println("Elements into Stack : "+stk);
		
		// Loop for Delete 4 Elements form the Stack
		for(int i = 0; i<4; i++) {
			stk.pop();
		}
		
		// Display Stack After Deleting Elements
		System.out.println("Elements After Deleting : "+stk);
		

	}

}


/*
 		Output :-
 		
 		Elements into Stack : [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		Elements After Deleting : [10, 20, 30, 40, 50, 60]

 */


