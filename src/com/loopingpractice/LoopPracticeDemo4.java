package com.loopingpractice;

public class LoopPracticeDemo4 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 20) {
			if (i % 5 != 0) {
				System.out.println(i);
			}
			
			i++;
		}

		System.out.println();

		for (int a = 1; a <= 20; a++) {
			if (a % 5 == 0) {
				System.out.println(a);
			}
			
		}
		
	}
}
