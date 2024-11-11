
/*
 Q)  Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, 
  and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
*/


package coreJava;


interface Shape{
	
	void getArea();
	
}


// Create Rectangle class which implements interface Shape

class Rectangle implements Shape{

	//  implement abstract method as per requirement ( Use getArea() method for calculating area of Rectangle  )
	
	public void getArea() {
		
		int length = 5;
		int bridth = 6;
		
		System.out.println("Area of Rectangle : "+length*bridth);
		
	}

}


//Create Circle class which implements interface Shape

class Circle implements Shape{
	
	
	//  implement abstract method as per requirement ( Use getArea() method for calculating area of Circle  )

	public void getArea() {
		
		float pi = 3.14f;
		int radius = 4;
		
		System.out.println("Area of Circle : "+ pi*(radius*radius));
		
	}

}


//Create Triangle class which implements interface Shape

class Tringle implements Shape{
	
	
	//  implement abstract method as per requirement ( Use getArea() method for calculating area of Triangle )

	public void getArea() {
		
		int base = 6;
		int height = 4;
		
		System.out.println("Area of Triangle : "+ 0.5*(base*height));
		
	}

}


public class InterfaceForGetArea {

	public static void main(String[] args) {
		
		
		// Creating an object of each class which have implements interface
		
		Rectangle objRect = new Rectangle();
		Circle objCir = new Circle();
		Tringle objTri = new Tringle();
		
		
		// Call getArea() method using objects
		
		objRect.getArea();
		objCir.getArea();
		objTri.getArea();

	}

}


/*

	Output :- 
	
	Area of Rectangle : 30
	Area of Circle : 50.24
	Area of Triangle : 12.0

 
 
*/


