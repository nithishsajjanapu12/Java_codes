package com.oops.exception;

import java.util.Scanner;

public class ExDemo10 {

	public static void main(String[] args) throws ExDemo9 {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible for vote ");
		} else {
			throw new ExDemo9();
		}
	}
}
