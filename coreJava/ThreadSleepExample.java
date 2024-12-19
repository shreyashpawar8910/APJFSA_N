
// Que) Write the program 1 to 10 & sleep for 500 millisecond using Thread.


package coreJava;


public class ThreadSleepExample extends Thread{

	/*
	 	Functionality of this Class

	 	Step 1: Create an Thread
	 	Step 2: Start a Thread
	 	Step 3: Display 1 to 10 Numbers
	 	Step 4: Use sleep() method and give time duration of 500 millisecond between each number display.
	 */


	// Declare run() method which automatically calls when thread start.
	public void run() {

		for(int i = 1; i<=10; i++) {

			try {

				System.out.println(i);

				// Current execution Thread can be sleep for 500 millisecond (0.5 sec)
				Thread.currentThread().sleep(500);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		// Create an Object of ThreadSleepExample class / Create a Thread
		ThreadSleepExample thread = new	ThreadSleepExample();

		// Start the Thread. 
		thread.start();

	}

}


/*
 		Output :-

 		1
		2
		3	
		4
		5
		6
		7
		8
		9
		10
 */

