package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("It is the leap year");
		} else {
			System.out.println("It is not leap year");
		}
			sc.close();
	}

}
