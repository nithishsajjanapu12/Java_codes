package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		
		for ( int a =1 ;a<=n;a++) { 					//Print the square of numbers from 1 to 10.
			System.out.println("square of "+a+" = " + (a*a));
		}
		for ( int i=1 ;i <= 100;i++) {					//Print all numbers between 1 and 100 that are divisible by 5.
			if(i % 5 == 0) {
				System.out.println(i+" ");
			}
		}
		int count =0;
		for(int b=1; b<=50;b++) {						//Count how many numbers exist between 1 and 50.
			if((1<=b)&&(b<=50)) {
				count++;
			}
		}
		System.out.println("Count of numbers exist between 1 & 50 : "+count);
	}

}
