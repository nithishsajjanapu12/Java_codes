package com.oops.exception;

import java.util.Scanner;

public class ExDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.println("ENter a : ");
			int a = sc.nextInt();
			System.out.println(a);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
