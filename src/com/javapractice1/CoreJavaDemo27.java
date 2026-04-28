package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number : ");
		int n = sc.nextInt();
		int reversed = 0;
		while(n!=0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reversed number : "+reversed);
	}

}
