package com.dev;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Age, ID;
		
		String Name;
		
		
		try (Scanner obj = new Scanner(System.in)) {
			
			System.out.println("Enter your Age");
			
			Age=obj.nextInt();
			
			System.out.println("Enter your Name");
			
			obj.nextLine();
			
			Name=obj.nextLine();
			
			System.out.println("Enter your ID");
			
			ID=obj.nextInt();
			
			System.out.println(Name);
			
			System.out.println(Age);
			
			System.out.println(ID);
			
		}
		
		
		

	}

}
