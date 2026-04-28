package com.javalooping;

import java.util.Scanner;

public class LoopDemo19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "Fizz buzz");
			} else if (i % 3 == 0) {
				System.out.println(i + "fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + "buzz");
			}
		}

	}

}
