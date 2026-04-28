package com.oops.exception;

public class ExDemo7 {
	public static void main(String[] args) {
		try {
			System.out.println("A");
			int x= 10/0;
			System.out.println("B");
		}catch(ArithmeticException ae){
			System.out.println("C");
			return;
		}
		finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
}
