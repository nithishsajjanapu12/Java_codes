package com.javapractice2;

//Given an integer, determine whether it is:
//
//Positive, negative, or zero (use ternary operator)
public class FunDemo6 {
	public static void main(String[] args) {
		int a = 10;

		String result = (a > 0) ? "positive" 
				: (a < 0) ? "negative" 
				: "zero";

		System.out.println(result);
	}
}
