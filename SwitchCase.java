package com.dev;

import java.util.Scanner;

public class SwitchCase {
	// The switch statement allows you to compare one expression against multiple constant values and run different code depending on value matches.
	
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a fruit name : ");
		
		String fruit= sc.nextLine().toLowerCase().trim();
		
		String Output;
		
		sc.close();
		
		switch(fruit) {
		
		
		case "apple" -> Output="Yes Apple is a fruit";
			
			
		case "mango" -> Output="Yes Mango is a fruit";
			
			
		case "orange" -> Output="Yes Orange is a fruit";
			
			
		case "banana" -> Output="Yes banana is a fruit";
		
		default -> Output="Invalid Fruit";
			
			
		
		
		}
		
		System.out.println(Output);
		
		
	}

}
