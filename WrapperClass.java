package com.dev;

//byte --> Byte

//short --> Short

//int --> Integer

//long --> Long

//float -->Float

//double --> Double

//char --> Character

//boolean --> Boolean

//It is used to  convert all primitives data type into its corresponding wrapper objects (through class) and vice-versa

public class WrapperClass {
	
	

	public static void main(String[] args) {
		
		byte b =10;
		short s=20;
		int i=30;
		long l=40;
		float f= 50.0F;
		double d=60.0D;
		char c='a';
		boolean bo=true;
		
		
		//AutoBoxing: Converting primitive data type into objects.
		
		//Creating object for particular variable.
		
		Byte myByte=b;
		
		Short myShort=s;
		
		Integer myInt=i;
		
		Long myLong=l;
		
		Float myFloat=f;
		
		Double myDouble=d;
		
		Character myChar=c;
		
		Boolean myBoolean=bo;
		
		
		
		// Printing objects
		
		System.out.println("----------Printing objects values----------");
		
		System.out.println("Byte object "+myByte);
		
		System.out.println("Short object "+myShort);
		
		System.out.println("Integer object "+myInt);
		
		System.out.println("Long object "+myLong);
		
		System.out.println("Float object "+myFloat);
		
		System.out.println("Double object "+myDouble);
		
		System.out.println("Character object"+myChar);
		
		System.out.println("Boolean object"+myBoolean);
		
		
		//UnBoxing: converting Objects into Primitive data types.
		
		
		byte b1 =myByte;
		
		short s1=myShort;
		
		int i1=myInt;
		
		long l1=myLong;
		
		float f1= myFloat;
		
		double d1=myDouble;
		
		char c1=myChar;
		
		boolean bo1=myBoolean;
		
		
		// Printing primitives
		System.out.println("----------Printing Primitive values----------");
		
		System.out.println("Primitive byte "+b1);
		
		System.out.println("Primitive short "+s1);
		
		System.out.println("Primitive int "+i1);
		
		System.out.println("Primitive long "+l1);
		
		System.out.println("Primitive float "+f1);
		
		System.out.println("Primitive double "+d1);
		
		System.out.println("Primitive char "+c1);
		
		System.out.println("Primitive boolean "+bo1);
		
		

	}

}
