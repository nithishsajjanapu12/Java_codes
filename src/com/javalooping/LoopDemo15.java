package com.javalooping;

import java.util.Scanner;

public class LoopDemo15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long n = sc.nextLong();
		long temp = n;

		long r;
		long sum = 0;
		int digitcount = 0;
		long t = n;
		while (t != 0) {
			digitcount++;
			t = t / 10;
		}
		while (n != 0) {
			r = n % 10;
			sum += Math.pow(r, digitcount);
			n = n / 10;
		}

		System.out.println("Result is : " + sum);
		if (temp == sum) {
			System.out.println("It is an Armstrong number");
		} else {
			System.out.println("It is not an Armstrong number");
		}

		sc.close();
	}
}