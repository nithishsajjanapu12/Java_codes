package com.practiceloop;

public class PracticeLoopDemo37 {

	public static void main(String[] args) {
		int i = 1;
		int m = i;
		int n = 500;
		int count = 0;
		while (i <= n) {
			if (i % 7 == 0 && i % 5 != 0) {
				count++;
			}
			i++;
		}
		System.out.println("Count from " + m + " to " + n + " which are divisible by 7 and not divisible by 5 is : " + count);
	}
}
