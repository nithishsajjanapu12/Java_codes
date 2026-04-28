package com.javaarray;

import java.util.Scanner;

//count occurences of a given number 
public class DemoArray16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int arr[] = { 11, 75, 33, 11, 7, 75, 225, 11 };

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % a == 0) {
				count++;
			}

		}
		System.out.println("Count : " + count);
	}

}
