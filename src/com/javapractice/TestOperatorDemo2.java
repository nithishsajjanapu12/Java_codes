package com.javapractice;
/*
 * (&)AND GATE      (|) OR GATE		    (^)NOT GATE				
 * 1   1   1		1   1   1			1   1   0
 * 1   0   0		1   0   1			1   0   1
 * 0   1   0		0   1   1			0   1   1
 * 0   0   0		0   0   0			0   0   0
 */
public class TestOperatorDemo2 {

	public static void main(String[] args) {
		int a= 12, b=5 ;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);

	}

}
/*
 * ======  Implementation =======
 * a = 12 , b = 5 ;
 * ------------------
 *  8	4	2	1
 *  ------------------
 *  1	1	0	0
 *  0	1	0	1
 *  ------------------
 *  0   1   0   0	(&) => 0 + 4 + 0 + 0 = 4
 *  1	1	0	1	(|) => 8 + 4 + 0 + 1 = 13
 *  1	0	0	1	(^) => 8 + 0 + 0 + 1 = 9
 * 
 */
