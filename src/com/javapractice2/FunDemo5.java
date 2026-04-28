package com.javapractice2;

public class FunDemo5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println("Addition is : "+(a+b));
		System.out.println("Subtraction is : "+(a-b));
		System.out.println("Multiplicatioin is : "+(a*b));
		System.out.println("Division is : "+(a/b));
		System.out.println("Modulus is : "+(a%b));

		
		// division gives quotient as output
		//modulus gives remainder as output
		int p = 21;
		int q = 10;
		
		int r = p/q;
		System.out.println("Division is : "+r);
		
		int s = p%q;
		System.out.println("Modulus is : "+s);
		
	}

}
