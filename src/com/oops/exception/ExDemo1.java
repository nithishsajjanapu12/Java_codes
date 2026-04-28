package com.oops.exception;

import java.util.Scanner;

public class ExDemo1 {
	
	public static void main(String[] args) {
		System.out.println("Main Method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter b number : ");
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("***********************************************************");
			System.err.println(e.getMessage());
			System.out.println("***********************************************************");
			System.err.println(e.toString());
		}
		finally {
			sc.close();
		}
	}

}
