// Program for Reverse the Number


package coreJava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);        // Define Scanner class

		System.out.println("Enter Number : ");      // Taking Input value from user
		int number = sc.nextInt();

		int reversed = 0;                          // initilise variable for store reverse number

		while (number != 0) {
			int temp = number % 10;                // Gatting the last digit using % symbole
			reversed = reversed * 10 + temp; 
			number /= 10; 
		}

		System.out.println("Reverse number is : "+reversed);      // Printing final output


	}

}


/*
  
   Output : 
   
    Enter Number : 
    123
    Reverse number is : 321

*/
