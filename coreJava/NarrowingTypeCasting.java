package coreJava;

public class NarrowingTypeCasting {

	double doubleVar = 45;
	long longVar = 90;
	
	public void TypeCasting() {
		
		// Printing values before type casting
		
		System.out.println("Before Type casting Double : "+doubleVar);
		System.out.println("Before Type casting Long : "+longVar);
		
		
		int a = (int)doubleVar;    // Type casting datatype Double into Integer
		int b = (int)longVar;      // Type casting datatype Long into Integer
		
		
		// Printing values after type casting
		
		System.out.println("After Type casting Double : "+a);
		System.out.println("After Type casting Long : "+b);
		
	}
	
	
	public static void main(String[] args) {
		
		NarrowingTypeCasting obj = new NarrowingTypeCasting();
		
		obj.TypeCasting();

	}
}


/*
 
  Output : 
  
  Before Type casting Double : 45.0
  Before Type casting Long : 90
  
  After Type casting Double : 45
  After Type casting Long : 90

  
*/ 
