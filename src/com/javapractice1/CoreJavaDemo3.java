package com.javapractice1;

/*
 * Problem:
Given two integers a and b, return the larger number using the ternary operator.

Input:
a = 10, b = 20
 */
public class CoreJavaDemo3 {
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		CoreJavaDemo3 cs = new CoreJavaDemo3();
		int b = (cs.a > cs.b) ? cs.a : cs.b;
		System.out.println(b + " is the largest number");
	}

}
