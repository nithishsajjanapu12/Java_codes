package com.loopingpractice;

public class LoopPracticeDemo2 {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			System.out.println(++i); // Prints 1 to 11
//			i++;
		}
		System.out.println();
		for (int j = 10; j > 0; --j) {
			System.out.println(j); // prints 10 to 1
		}
		System.out.println();
		for (int k = 1; k <= 20; k++) {
			if (k % 2 == 0) {
				System.out.println(k); // prints 1 to 20 even numbers
			}
		}
	}

}
