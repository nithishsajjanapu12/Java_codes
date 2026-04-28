package com.javafundamentals;

import java.util.Scanner;

public class Methodcalling {

	static Scanner sc = new Scanner(System.in);

	static void Addition(int a, int b) {

		int c = a + b;
		System.out.println("Addition is : " + c);

		System.out.println("Enter d : ");
		int d = sc.nextInt();

		Subtraction(c, d);
		

	}

	static void Subtraction(int e, int f) {
		int g = e - f;
		System.out.println("Substraction  is : " +g);
		System.out.println("Enter i : ");
		int i = sc.nextInt();

		Multiplication(g,i);
	}
	static void Multiplication(int j,int k) {
		int l = j * k;
		
		System.out.println("Multiplication is : "+l);
		System.out.println("Enter m : ");
		int n= sc.nextInt();
		
		Division(l,n);
	}
	static void Division(int p,int q) {
		int s = p / q;
		
		System.out.println("Division : "+s);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a : ");
		int a = sc.nextInt();

		System.out.println("Enter b : ");
		int b = sc.nextInt();
		Addition(a, b);

	}

}
