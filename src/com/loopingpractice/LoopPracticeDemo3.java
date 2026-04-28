package com.loopingpractice;

public class LoopPracticeDemo3 {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("Java"); // prints java 5 times
			i++;
		} while (i <= 5);

		System.out.println();
		System.out.println();
		System.out.println();

		int j = 1, k = 5;
		do {
			System.out.println(k + " * " + j + " = " + k * j); // 5 multiplication table
			j++;
		} while (j <= 10);

		for (int a = 1; a <= 100; a++) {
			if (a == 50) {
				break;
			}
			System.out.println(a); //prints upto 49
		}
		
	}

}
