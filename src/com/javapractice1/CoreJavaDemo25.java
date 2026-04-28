package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo25 {
	static void factorial(long num) {
		long fact = 1;
		for (long i = num; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("factorial : " + fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		long n = sc.nextLong();

		factorial(n);
		sc.close();
	}

}
