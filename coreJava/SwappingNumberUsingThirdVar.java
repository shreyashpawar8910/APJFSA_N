
// Program for swapping two numbers using third variable 


package coreJava;

import java.util.Scanner;

public class SwappingNumberUsingThirdVar {

	public static void main(String[] args) {


		// Importing and Creating object of Scanner class
		Scanner sc = new Scanner(System.in);


		// Getting input value from user
		System.out.println("Enter Value of A : ");
		int a = sc.nextInt();

		System.out.println("Enter Value of B : ");
		int b = sc.nextInt();


		// Print Value before swapping
		System.out.println("Before Swapping Value of A : "+a);
		System.out.println("Before Swapping Value of B : "+b);

		// Swapping two numbers using third variable (temp)
		int temp = a;
		a = b;
		b = temp;

		
		// Print Value after swapping
		System.out.println("After Swapping Value of A : "+a);
		System.out.println("After Swapping Value of B : "+b);



	}

}


/*
  
  
  Output : 
  
    Enter Value of A : 
	10
	Enter Value of B : 
	20
	Before Swapping Value of A : 10
	Before Swapping Value of B : 20
	
	After Swapping Value of A : 20
	After Swapping Value of B : 10

 
*/
