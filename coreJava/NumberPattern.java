
// **** Program for printing number pattern *******

package coreJava;

public class NumberPattern {

	public static void main(String[] args) {
		
		
		// **** Nested For loop for print number pattern ******** 
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(j);
				
			}
			System.out.println();
			
		}
		

	}

}


/*

	Output : 
	
	1
	12
	123
	1234
	12345



*/