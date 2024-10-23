package coreJava;

public class AreaPerimeterOfSquare {

	
	// Method for calculating area of square
	public void AreaOfSquare(float side) {
		
		float ans = side*side;   // calculating using formula
		
		System.out.println("Area of Square : "+ans);
		
	}
	
	
	// Method for calculating perimeter of square 
	public void Perimeter(float side) {
		
		float ans = 4*side;     // calculating using formula
		
		System.out.println("Perimeter of Square : "+ans);
		
	}
	
	
	public static void main(String[] args) {
		
		//  Creating an object
		
		AreaPerimeterOfSquare obj = new AreaPerimeterOfSquare();
		
		obj.AreaOfSquare(5);      //  Passing value of side as a parameter  
 		
		obj.Perimeter(5);         //  Passing value of side as a parameter 

	}

}
