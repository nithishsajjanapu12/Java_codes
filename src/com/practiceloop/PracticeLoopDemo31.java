package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");


		while (true) {
			int n = sc.nextInt();
			if (n < 0 || n == 0) {
				System.out.println("Negative number or Zero found ");
				System.out.println("Condition Satisfied");
				break;
			} else {
				System.out.println("Try again !!");
				System.out.println("Console stopped");
			}
			
		}

	}

}
