package com.dev;

public class DataTypeCasting {

	public static void main(String[] args) {
		// Widening casting( Automatic casting) - converting smaller type into larger type size
		// byte-> short-> char-> int-> long-> float-> double.
		
		
		
		// Narrow casting(manual casting)- converting larger type into smaller type size
		// double-> float-> long-> int-> char-> short-> byte.
		
		
		
		int myInt=9; // integer
		
		double myDouble=myInt; // Automatic casting 
		System.out.println(myInt);
		System.out.println(myDouble);
		
	//-------------------------------------------------------//	
		
		double myDouble1=9.77d;// double
		
		int myInt1=(int) myDouble1;// Manual casting
		System.out.println(myDouble1);
		System.out.println(myInt1);

	}

}
