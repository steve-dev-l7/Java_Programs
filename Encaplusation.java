package com.dev;

public class Encaplusation {

	// Encapsulation is wrapping  (data + methods) together into a single unit and restricting direct access to some of the object components
	
	// Encapsulation is data hiding + controlled access using (getter and setter and private).
	
	public static void main(String[] args) {
		String UserName="Steve";
		
		Person per=new Person(UserName,20);
		
		
		System.out.println(per.getName() +"  "+ per.getAge());
		
		
	}

}

class Person{
	
	private String name;
	
	private int age;
	
	
	
	//Constructor
	public  Person(String newName, int age) {
		this.name=newName; // 'this' is a key word that represent to the current object, the object who's method or constructor being called.
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
}
