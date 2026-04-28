package com.javapractice;
//Write a program with a no-argument constructor that prints "Object Created" when an object is instantiated.
public class ConstructorDemo7 {
	ConstructorDemo7(){
		System.out.println("Method called !");
	}
	public static void main(String[] args) {
		ConstructorDemo7 cd = new ConstructorDemo7();
	}

}
