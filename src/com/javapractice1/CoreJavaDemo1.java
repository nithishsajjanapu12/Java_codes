package com.javapractice1;

/*
 * Problem:
Create a class that prints:

One static variable

One instance variable

One local variable
 */
public class CoreJavaDemo1 {
	static int a = 10;
	int b = 20;

	public static void main(String[] args) {
		System.out.println("Static variable : " + a);
		System.out.println("Static variable : " + CoreJavaDemo1.a);

		int c = 30;
		System.out.println("Local variable : " + c);
		CoreJavaDemo1 cd = new CoreJavaDemo1();
		System.out.println("Instance variable : " + cd.b);

	}

}
