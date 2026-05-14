package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int sum = 0;
		int n = sc.nextInt();
		int i = 0;
		while (i <= n) {
			if (i % 2 != 0) {
				sum = sum + i;
			} 
			i++;
		}
		System.out.println("Sum of odd numbers  up to " + n + " is : " + sum);
	}

}

