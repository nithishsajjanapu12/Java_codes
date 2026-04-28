package com.javapractice1;

public class CoreJavaDemo11 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=100;i++) {					             	//Find the sum of numbers from 1 to 100.
			sum = sum + i;
		}
		System.out.println("Sum of numbers of 1 to 100 : "+sum);
		
        int sum1=0;                                                 //Find the sum of even numbers between 1 and 50.
		for(int a=1;a<=50;a++) {
			if(a % 2 == 0) {
			sum1 = sum1+a;
			}
		}
		System.out.println("Sum of even numbers between 1 and 50 : "+sum1);
	}

}
