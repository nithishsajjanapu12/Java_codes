package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to search for : ");

		int i = 0;
		int arr[] = { 2, 3, 4, 5, 6, 7 };
		while (true) {
			int n = sc.nextInt();
			if (arr[i] == n) {
				System.out.println("Number found successfully !!");
				break;
			} else {
				System.out.println("Number not Found ,Please try again !!!");
			}
		}

		sc.close();
	}

}
