package com.javapractice1;

import java.util.Scanner;

// using for loop : input = 1234 output = 4
public class CoreJavaDemo7 {
	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		for (int i = a; i != 0; i = i / 10) {
			int b = i % 10;
			CoreJavaDemo7 cd = new CoreJavaDemo7();
		}
		System.out.println(count);
		sc.close();
	}

}

class CoreJavaDemo100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int r = sc.nextInt();
		int count = 0;
		for (int d = r; d != 0; d = d / 10) {
			int k = d % 10;
			count++;
		}
		System.out.println(count);
		sc.close();

	}
}
