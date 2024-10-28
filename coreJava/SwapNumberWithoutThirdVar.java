
// Program for swapping two numbers without using third variable 


package coreJava;

import java.util.Scanner;

public class SwapNumberWithoutThirdVar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of A : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Value of B : ");
        int b = sc.nextInt();

        System.out.println("Before Swapping Value of A = " + a);
        System.out.println("Before Swapping Value of B : "+b);

        
        // Swap two variables without using third variable
        a = a + b;  
        b = a - b;  
        a = a - b;  

        
        // Print values after swapping 
        System.out.println("Before Swapping Value of A = " + a);
        System.out.println("Before Swapping Value of B : "+b);

	}

}



/*

	Output : 
	
	
	Enter Value of A : 
	1
	Enter Value of B : 
	2
	Before Swapping Value of A = 1
	Before Swapping Value of B : 2
	Before Swapping Value of A = 2
	Before Swapping Value of B : 1


*/
