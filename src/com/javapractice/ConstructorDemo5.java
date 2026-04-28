package com.javapractice;
//Write a program to create a class Student with a constructor that initializes id and name, and prints them.
public class ConstructorDemo5 {
	int id;
	String name;
	ConstructorDemo5(int id,String name){
		this.id=id;
		this.name = name;
	}
	public static void main(String[] args) {
		ConstructorDemo5 cd = new ConstructorDemo5(102,"Nithish");
		cd.display();
	}

	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
	}
}
