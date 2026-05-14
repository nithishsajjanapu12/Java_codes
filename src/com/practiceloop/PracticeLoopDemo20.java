package com.practiceloop;

import java.util.Scanner;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
public class PracticeLoopDemo20 {

	public static void main(String[] args) {
		int fibo1 = 0;
		int fibo2 = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= n) {
			System.out.print(fibo1 + " ");
			sum = sum + fibo1;
			int fibo3 = fibo1 + fibo2;

			fibo1 = fibo2;
			fibo2 = fibo3;

			i++;

		}
		System.out.println("Fibo sum is : " + sum);

	}

}