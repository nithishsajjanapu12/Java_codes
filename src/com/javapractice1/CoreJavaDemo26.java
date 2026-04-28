package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo26 {
	static long findFact(long n) {
		if(n==0|| n==1) {
			return 1;
		}
		
		return n * findFact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number : ");
		long n = sc.nextLong();
		
		long fact = findFact(n);
		 
		System.out.println("Factorial of n is : "+fact);
	}

}
