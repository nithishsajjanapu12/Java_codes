package com.loopingpractice;

//double declaration in for loop
public class LoopPracticeDemo1 {

	public static void main(String[] args) {
		for (int i = 10, j = 0; i >= 0 && j <= 10; i--, j++) {
			System.out.println(i + "  -  " + j);
		}

		System.out.println();

		for (int i = 1, j = 10; i <= j; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}

	}

}
