package com.javapractice2;
//Write a program that:
//
//Prints numbers from 1–100
//
//Replaces multiples of 3 with "Fizz", 5 with "Buzz", both with "FizzBuzz"
public class FunDemo8 {

	public static void main(String[] args) {
		for(int i =1 ;i<=100;i++) {
			if(i % 3 ==0 && i % 5 ==0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3==0) {
				System.out.println("fizz");
			}
			else if (i % 5 ==0) {
				System.out.println("Buzz");
			}
			else {
			 System.out.println(i);
			}
		}
		
	}

}
