package com.javapractice1;

import java.util.Scanner;

/*
 * Problem:
Given an integer n, determine whether it is Positive, Negative, or Zero.

Input:
n = -5
 */
public class CoreJavaDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println("Positive number : ");
		} else if (n < 0) {
			System.out.println("Negative number : ");
		} else {
			System.out.println("it is zero ");
		}
		sc.close();
	}

}
