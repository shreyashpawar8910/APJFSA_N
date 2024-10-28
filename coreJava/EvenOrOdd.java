
// Program for check given number is Even or Odd


package coreJava;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		// Importing and Creating object of scanner class
		
		Scanner sc = new Scanner(System.in);
		
		
		// Getting value as a input from user
		
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		
		// Checking given number Even or Odd  
		
		if(num%2 == 0) {
			
			System.out.println("Given number is Even");
			
		}else {
			
			System.out.println("Given number is Odd");
			
		}
		

	}

}



/*

	Output : 

	i)
	
	Enter Number : 
	10
	Given number is Even


	ii)
		
	Enter Number : 
	11
	Given number is Odd

 
*/

