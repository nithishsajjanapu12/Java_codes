package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum=0;

		

		while (n > 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println("Product of the digits of " + temp + " is : " + sum);
	}

}
