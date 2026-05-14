package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 five numbers from 1 to 100");
		int n;
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Insert number " + i);
			n = sc.nextInt();
			if (n == 0) {
				continue;

			}
			sum = sum + n;

		}
		System.out.println("Sum is : " + sum);

	}

}
