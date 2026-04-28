package com.operators;

public class Swapnum {
	//SWAP THE NUMBER OF a AND b
	static int a =10;
	static int b =20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before swap value of a : "+a);
		System.out.println("Before swap value of b : "+b);
		a= a + b;
		b= a - b;
		a= a - b;
		System.out.println("After swap value of a : "+a);
		System.out.println("After swap value of b : "+b);
	}

}
