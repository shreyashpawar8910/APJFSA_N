
// Que) Write a program to create a class DisplayMessage which implements the runnable interface content a run method only.


package coreJava;

public class DisplayMessageRunnable implements Runnable{

	/*
	 	Functionality of this Method

	 	Step 1: Implements Runnable Interface
	 	Step 2: Create Thread and start the Thread.
	 	Step 3: Override run Method and print some message into run() method 
	 */

	// Override run method
	public void run() {

		System.out.println("My Name is Shreyash");

	}


	public static void main(String[] args) {

		// Create an object of DisplayMessageRunnable class 
		DisplayMessageRunnable obj = new DisplayMessageRunnable();

		// Create an Thread using class's object
		Thread thread = new Thread(obj);

		// Start the Thread
		thread.start();
	}

}


/*
 	Output :-

 	My Name is Shreyash

 */

