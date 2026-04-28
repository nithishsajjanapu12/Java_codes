package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo24 {
	boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i + " ");

				sum = sum + i;
			}
			if(sum==n) {
				status = true;
			}
		}
		return status;
	}

	void main(String[] args) {
		System.out.println("Main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		boolean flag = isPerfect(n);

		if (flag) {
			System.out.println("The given number is perfect number ");
		} else {
			System.out.println("The given number is not perfect number ");
		}

	}

}
