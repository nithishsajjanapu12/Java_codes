package com.javalooping;

//import java.lang.Math;
import java.util.Scanner;

// 153 = 1^3 + 5^3 + 3^3 = 153
public class LoopDemo16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int temp = n;
		int digitCount = 0;

		// Count number of digits
		while (temp != 0) {
			digitCount++;
			temp = temp / 10;
		}

		System.out.println("Count of digits : " + digitCount);

		temp = n; // reset temp
		int sum = 0;

		// Calculate sum of digits raised to digitCount power
		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digitCount);
			temp = temp / 10;
		}

		System.out.println("Sum : " + sum);
	}

}
