package com.javapractice;

public class TestOperatorDemo6 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before swap : ");
		System.out.println("a= "+ a + " b= " + b );
		
		a = a ^ b;
		/* 
		 * 16	8	4	2	1
		 * 0	1	0	1	0
		 * 1	0	1	0	0
		 * ---------------------
		 * 1	1	1	1	0     -> 30
		 * 
		 * a = a ^ b = 30 -> a = 30 -> 1	1	1	1	0
		 */
		b = a ^ b;
		/*
		 * before we got a = 1	1	1	1	0 as updated value of 'a'
		 *  16	8 	4	2	1
		 *  1	1	1	1	0
		 *  1	0	1	0	0
		 * ----------------------
		 *  0	1	0	1	0       -> 10
		 *  
		 *  b = a ^ b = 10 -> b = 10
		 */
		a = a ^ b;
		/*
		 * before  we got b = 0  	1	0	1	0
		 * 16 	8	4	2	1
		 * 1	1	1	1	0
		 * 0	1	0	1	0
		 * ---------------------------
		 * 1	0	1	0	0           -> 20
		 */
		System.out.println();
		System.out.println("After swap : ");
		System.out.println("a= "+ a + " b= " + b );
	}
}
