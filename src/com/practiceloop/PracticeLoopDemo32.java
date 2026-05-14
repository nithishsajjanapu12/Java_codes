package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		while (true) {
			int n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println(n);
			} else if (n % 2 != 0) {
				continue;
			} else if (n == 0) {
				System.out.println("Program Terminated  !!!");
				break;
			}
		}
	}

}
