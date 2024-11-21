
// Q) Write Java Exception Handling program  using  multiple catch block.


package coreJava;

public class ExceptionMultipleCatch {

	
	/*
	 
	 	Functionality of this method
	 	
	 	Step 1:- This method used for demonstrate for Exception handling using multiple catch blocks.
	 
	 */
	public static void main(String[] args) {

		// Create try block for write code which have possibility to throw exception
		
		try {
			
			int num = 10/0;					// ** This code throwing an exception
			
		}
		
		
		// Declate catch block for catch ArrayIndexOutOfBoundsException 
		catch(ArrayIndexOutOfBoundsException e1) {
			
			System.out.println("Exception Occure "+e1);
			
		}
		
		// Declate catch block for catch ArithmeticException
		catch(ArithmeticException e2) {
			
			System.out.println("Exception Occure "+e2);
			
		}
		
		// Declate catch block for catch NullPointerException
		catch(NullPointerException e3) {
			
			System.out.println("Exception Occure "+e3);
			
		}
		
		// Declate catch block for catch parent class exception
		catch(Exception e4) {
			
			System.out.println("Exception Occure "+e4);
			
		}

	}

}




/*
 
 		Output :-
 		
 		Exception Occure java.lang.ArithmeticException: / by zero

 */



