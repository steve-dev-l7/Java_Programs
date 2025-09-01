package com.dev;

class Car2 {
	
	
	/* Object oriented programming (OOPS) it is way of writing and organizing code using objects , which are real world things like a car, a book , a person etc
	it makes code easier to manage reuse and understand.*/

	// Class: A blueprint for creating objects example a car class defines what a car is(wheel, engine, color).
	
	/* Object: An object is a real world entity created using a class it has two main parts properties(attributes or data). You can create many object from one 
	class each with different values.*/
	
	//Methods: Also called function or behavior. 
	
	// A red Honda is the object of the car class.
	
	/*     Class
	 * 		 |
	 * 		 V
	 * 	   Object
	 * 		 |
	 * 		 V
	 * 	   Method
	 * 		 |
	 * 		 V
	 * 		data
	 */

	//-------------------------//
	 
	 
	//Properties also called attributes
		
		
	String color;
	int year;
			
			
			 
	void StartEngine() {
		
		
				
		System.out.println("Engine Started");
				
		}
 }
	 
	
	
 public class Car{
		
		
	 public static void main(String[] args) {
			
			Car2 car2=new  Car2();
			
			car2.color="Blue";
			car2.year=2025;
			
			System.out.println(car2.color);
			System.out.println(car2.year);
			car2.StartEngine();
			
		}
		
	}
 
 
 
	

