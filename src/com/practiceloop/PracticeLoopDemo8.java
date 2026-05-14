package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit : ");
		int n = sc.nextInt();

		int i = 1;
		int sum = 0;
		while (i <= n) {
			if (i % 2 != 0) {
				sum = sum + i;
				
			}
			i++;
		}
		System.out.println("Even Sum is : "+sum);
	}

}
