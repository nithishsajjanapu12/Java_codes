package com.javapractice2;
//Prints their default values (without initializing them — observe what happens)
public class FunDemo2 {
		int a;
		byte b;
		short s;
		char c;
		double d;
		float f;
		
	public static void main(String[] args) {
		FunDemo2 fd = new FunDemo2();
		System.out.println("Default value of int is "+fd.a);
		System.out.println("Default value of byte is "+fd.b);
		System.out.println("Default value of short is "+fd.s);
		System.out.println("Default value of char is "+fd.c);
		System.out.println("Default value of double is "+fd.d);
		System.out.println("Default value of float is "+fd.f);

		
	}

}
