package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for a : ");
		int a = sc.nextInt();

		System.out.println("Enter number for b : ");
		int b = sc.nextInt();

		while (a <= b) {
			if (a % 7 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
	}

}
