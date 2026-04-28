package com.javaarray;

import java.util.Scanner;

//Remove duplicates from a sorted array
public class DemoArray17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5 };
		System.out.println("Main method started");

		int n = arr.length;

		if (n == 0 || n == 1) {
			System.out.println("New length: " + n);
			return;
		}

		int j = 0; // index of unique element

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];

			}
		}

		// j+1 is the number of unique elements
		System.out.println("New length: " + (j + 1));

		for (int i = 0; i <= j; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
