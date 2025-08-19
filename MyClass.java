package com.dev;


public class MyClass {
	
	public static int sum;
	
	public static void main(String[] args) {

		sum=addition(10,60);
		
		System.out.println("Sum is"+ sum); 
		
	}
	
	private static int addition(int a,int b) {
		
		int sum=a+b;
		
		return sum;
	}

}
