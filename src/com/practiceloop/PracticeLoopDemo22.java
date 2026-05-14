package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.println("Cube of " + i + " is : " + i * i * i);
			i++;
		}
	}

}
