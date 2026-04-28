package com.javapractice;

public class TestOperatorDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("before swap : ");
		System.out.println("a= "+ a + " b= " + b + " c= " + c );
		
		a = a ^ b;
		/* 
		 * 16	8	4	2	1
		 * 0	1	0	1	0
		 * 1	0	1	0	0
		 * ---------------------
		 * 1	1	1	1	0                -> 30
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
		 *  0	1	0	1	0                -> 10 
		 *  
		 *  b = a ^ b = 10 -> b = 10
		 */
		a = a ^ b;
		/*
		 * before  we got b = 0  1	0	1	0
		 * 16 	8	4	2	1
		 * 1	1	1	1	0
		 * 0	1	0	1	0
		 * ---------------------------
		 * 1	0	1	0	0                -> 20 - a=20
		 */
		
		b = b ^ c;
		/*
		 * 16	8	4	2	1
		 * 0	1	0	1	0
		 * 1	1	1	1	0
		 * -------------------------
		 * 1	0	1	0	0              -> 20 
		 */
		c = b ^ c;
		/*
		 * 16 	8	4	2	1
		 * 1	0	1	0	0
		 * 1	1	1	1	0
		 * --------------------------
		 * 0	1	0	1	0              -> 10 - c=10
		 */
		b = b ^ c;
		/*
		 * 16	8	4	2	1
		 * 1	0	1	0	0
		 * 0	1	0	1	0
		 * -------------------------
		 * 1	1	1	1	0               ->30 - b=30
		 */
		System.out.println("\nAfter swap  : ");
		System.out.println("a= "+ a + " b= " + b + " c= " + c );
		
	}

}
