package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " fizz buzz");
			} else if (i % 5 == 0) {
				System.out.println(i + " buzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " fizz");
			}
			
			sc.close();
		}
	}
}
//			if((i % 3 == 0 )|| (i % 5 == 0) || ((i % 3 == 0)&&(i % 5 ==0))){   }
/*
*
*
*/