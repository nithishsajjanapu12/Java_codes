package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo28 {
	static int  reverse(int num) {
		int rev =0;
//		boolean status = false;
		while(num!=0) {
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num /10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int n = sc.nextInt();
		int num = n;
		
		isPalindrome(n);
	}
	static boolean isPalindrome(int num) {
		if(num<0) {
			return false;
		}
		return num == reverse(num);
	}

}
