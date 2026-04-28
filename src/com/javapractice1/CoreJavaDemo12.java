package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo12 {

	public static void main(String[] args) {
		// Reverse a number using a for loop.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int rev=0;
		for (int i = n; i > 0; i = i / 10) {
			int digit = i % 10;
			rev = rev * 10 + digit;
			
		}
		System.out.println("Entered number : "+n);
		System.out.println("Reversed number : "+rev);
	}

}
