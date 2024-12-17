
// Que) Read contain of file line by line and copy into another file without using copy function.


package coreJava;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileCopyWithoutCopyFun {

	public static void main(String[] args) {
		/*
		 	Functionality of this Code

		 	Step 1: Create an File welcome.txt and Write data into file
		 	Step 2: Close welcome.txt file
		 	Step 3: Create Another Empty file
		 	Step 4: Iterate each line of welcome.txt file's data
		 	Step 5: Copy each line as it is of welcome.txt file into another Destination.txt file
		 	Step 6: Close Destination.txt file
		 */

		try {

			// Create File - welcome.txt
			FileWriter fw = new FileWriter("G://welcome.txt");

			// Write data into welcome.txt file
			fw.write("Hello, This is APJFSA Course of Anudip");
			fw.close();


			// Create an Object of welcome.txt File 
			File source = new File("G://welcome.txt");

			// Create an Scanner class's object and pass object of welcome.txt file's object
			Scanner sc = new Scanner(source);

			// Create an Destination.txt file
			FileWriter dest = new FileWriter("G://Destination.txt");


			// while loop for iterate each line of the welcome.txt file
			while(sc.hasNextLine()) {

				// Get data from welcome.txt file and pest it on Destination.txt file
				String line = sc.nextLine();    // Read the next line
				dest.append(line);              // Write the line to the destination file

			}

			// Close Destination file 
			dest.close();

		}catch(IOException e) {

			System.out.println("Error"+e);

		}

	}

}



/*
 		Output :- 

 		welcome.txt file -
 			Hello, This is APJFSA Course of Anudip

 		Destination.txt file - 
 			Hello, This is APJFSA Course of Anudip
 */

