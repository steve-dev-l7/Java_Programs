package com.dev;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		
		Converter();

	}
	
	
	public static void Converter() {
		
		
		String userNumber;
		
		
		try{
			
			Scanner scanner =new Scanner(System.in);
			
			System.out.print("Enter value to convert :");
			
			userNumber=scanner.nextLine();
			
			int integer=Integer.parseInt(userNumber);
			
			float toFloat=Float.parseFloat(userNumber);
			
			double toDouble=Double.parseDouble(userNumber);
			
			
			
			System.out.println("Integer value "+integer);
			
			System.out.println("Float value "+toFloat);
			
			System.out.println("Double value "+toDouble);
			
			scanner.close();
			
		
		
		}catch(Exception e) {
			System.out.println("Enter only numbers");
			Converter();
		}
		
		
		
	}

}
