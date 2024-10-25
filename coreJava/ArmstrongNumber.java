
// Program for check number is Armstrong or not

package coreJava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");         // Input value from user
		int number = sc.nextInt();                     
		int tempNumber = number;                       // Store value into temperory variable
		
        int digit = String.valueOf(number).length();   // Finding length of digit
        
        int armstrong = 0;
        
		while (number != 0) {
			int temp = number % 10;                   // Getting the last digit using % operator
			int var = temp;
			
			int i = 1;
			while(i<digit) {
				temp = temp*var;                      // While loop for do multiplication of saperate digit
				i++;
			}
			
			armstrong = armstrong + temp;        
			number /= 10;
		}
		

													// Printing the number is armstrong or not
		
		  if(tempNumber == armstrong) {
		  
		  System.out.println("This is Armstrong number");

		  }else {
 
		  System.out.println("This is not in Armstrong number"); }

	}

}



/*

    Output : 
    
	Enter Number : 
	153
	This is Armstrong number

 
*/
