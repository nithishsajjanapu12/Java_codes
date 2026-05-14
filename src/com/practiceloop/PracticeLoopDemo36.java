package com.practiceloop;

public class PracticeLoopDemo36 {

	public static void main(String[] args) {
		int i = 1;
		int n = 100;

		while (i <= n) {
			int num = i;
			int sum = 0;
			int digit = 0;
			while (num > 0) {
				digit = num % 10;
				sum = sum + digit;
				num = num / 10;
			}

			if (sum % 2 == 0) {
				System.out.println(i+" - "+sum);
			}

			i++;
		}

	}

}
