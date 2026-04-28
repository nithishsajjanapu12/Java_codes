package com.javapractice;

public class TestOperatorDemo3 {

	public static void main(String[] args) {
		int x = 5;
		String result = (x > 0) ? (x % 2 == 0 ? "Even" : "Odd") : "Negative";
		System.out.println(result);
	}

}
