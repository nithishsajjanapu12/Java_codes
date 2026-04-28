package com.javafundamentals;

import java.util.Scanner;

public class SameMethod {
	void SameMethod1(int num) {
		System.out.println(" value in char is : " + (char) (num));
	}

	void SameMethod2(char s1) {
		System.out.println(" value in Ascii : " + (int) (s1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SameMethod sm = new SameMethod();
		System.out.println("Enter ascii to convert to char : ");
		int n = sc.nextInt();
		System.out.println("Enter Char to convert to ascii : ");
		char s1 = sc.next().charAt(0);
		sm.SameMethod1(n);
		sm.SameMethod2(s1);
		sc.close();
	}
}
