package com.arrayjava;

import java.util.Scanner;

//sum of the digits of given number
public class ArrayDemo24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; n > 0; i++) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
