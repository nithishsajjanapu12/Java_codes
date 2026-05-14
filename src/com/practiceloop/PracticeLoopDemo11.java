package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int count = 0;

		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			count++;
		}
		System.out.println("Number of digits in "+ temp  + "is : "+count);
	}

}
