package com.practiceloop;

public class PracticeLoopDemo27 {

	public static void main(String[] args) {
		int i = 1;
		int n = 100;
		while (i <= n) {
			System.out.println(i);
			if (i % 17 == 0) {
				break;
			}
			i++;
		}
	}

}
