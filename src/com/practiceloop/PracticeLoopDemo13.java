package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo13 {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = n;

		int rev = 0;
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		if(rev==temp) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}

	}

}
