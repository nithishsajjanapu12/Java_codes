package com.javaarray;

import java.util.Scanner;

public class DemoArray1  {
		int a=10;
		int b=10;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		
		System.out.println("YOU printed this number : "+n);
		DemoArray1 ad = new DemoArray1();
		System.out.println(ad.a);
		System.out.println(ad.b);
		sc.close();
	}

}
