// Program for to find the larger Number


package coreJava;

import java.util.Scanner;                               // Import scanner class

public class LargerNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);            // Creating object of scanner class
		
		
		System.out.println("Enter First Number : ");   
		int num1 = sc.nextInt();                        // input first number from user
		
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();                        // input first number from user
		
		System.out.println("Enter Third Number : ");
		int num3 = sc.nextInt();                        // input first number from user
		 
		
		// If else statements for checking largest number

		if(num1 > num2 && num1 > num3) {
			
			System.out.println(num1+" is largest number");
			
		}else if (num2 > num1 && num2 >num3) {
			
			System.out.println(num2+" is largest number");
			
		}else if(num3 > num1 && num3 > num2) {
			
			System.out.println(num3+" is largest number");
			
		}
		
	}

}
