package com.arrayjava;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
		
		//Array declare
		int [] a = new int[5];
		
		//Array Initialization
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
//		a[5]=60; exceeds the length -> java.lang.ArrayIndexOutOfBoundsException
		
		//Array Printing
		System.out.println(a); // Address
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
//		System.out.println(a[5]); exceeds the length -> java.lang.ArrayIndexOutOfBoundsException
		
		//------------------------------------------------------------------------------------------------
		
		System.out.println("------------------------");
		
		int []a1 = {10,20,30,40,50,60,70};
		
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		sc.close();
	}

}
