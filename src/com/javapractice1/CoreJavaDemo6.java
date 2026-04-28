package com.javapractice1;

import java.util.Scanner;

/*
 * input 122334 output sum of all digits in the number
 */
public class CoreJavaDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int sum=0;
		for(int i=122334;i != 0;i = i/10) {
			int r = i % 10;
			sum = sum + r;
		}
//		while(a != 0) {
//			a = a / 10;
//			int b = a % 10;
//			sum = sum + b;
//		}
	    
		System.out.println("Sum is "+sum);
		sc.close();
	}

}
