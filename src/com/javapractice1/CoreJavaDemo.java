package com.javapractice1;

/*
 * Problem:
Given a string s, determine whether it is a valid Java identifier.

Input:
s = "totalMarks"

Output:
true
 */
public class CoreJavaDemo {

	public static void main(String[] args) {
		int i = 10;
		float f = 10.5f;
		char ch = 'A';
		String s = "Java";
		boolean b = true;

		System.out.println(i + " \t" + f + "\t" + ch + "\t" + b + "\t" + s);

		int $r = 12;
		int _e = 10;
		int hi_hello = 22;
		int go$ = 34;

		System.out.println($r + "\t" + _e + "\t" + hi_hello + "\t" + go$);
	}

}
