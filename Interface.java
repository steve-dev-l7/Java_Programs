package com.dev;


// A Interface is a set of behavior that classes agree to perform it enables abstraction Polymorphism by separating what from how

// Interface cannot be instantiated. so class must adopt them using implement key word.

// By programming to interfaces rather than to concrete classes, your system becomes more modular, flexible, and testable.

// Write a program to create a interface get details of the student(id, name, course). Java Python DotNet


// Write a program name the java interface with two methods start and stop  

interface first{
	
	public void Print1();
	
}

interface Second{
	
	public void Print2();
	
}

interface Third extends first,Second{
	
	public void Print3();
	
}


class Child implements Third{

	@Override
	public void Print1() {
		System.out.println("Hello");
		
	}

	@Override
	public void Print2() {
		System.out.println("Hello");
		
	}

	@Override
	public void Print3() {
		System.out.println("Hello");
		
	}
	
	
	
}




public class Interface{
	
	public static void main(String[] args) {
		
		Child child= new Child();
		
		child.Print1();
		child.Print2();
		child.Print2();
		
		
		
		
	}
	
}


