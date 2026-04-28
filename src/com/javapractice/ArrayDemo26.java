package com.javapractice;

//reverse a given integer
import java.util.Scanner;

public class ArrayDemo26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int rev = 0;
		for (int i = 0; n > 0; i++) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
