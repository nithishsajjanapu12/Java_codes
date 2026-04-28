package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) { 					        //Find the factorial of a number using a for loop.
			fact = fact * i;
		}
		System.out.println("factorial of "+ n+"  is "+fact);
	}

}
