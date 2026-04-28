package com.operators;

import java.util.Scanner;

public class TernaryDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks please : ");
		int a = sc.nextInt();

		String result = (a > 90 && a <= 100) ? "A"
				: (90 >= a && a < 80) ? "B"
						: (80 >= a && a < 70) ? "C"
								: (70 >= a && a < 50) ? "D"
										: (50 >= a && a < 35) ? "F"
												: (100 < a || a < 0) ? "Invalid" : "Better luck next time";
		System.out.println(result);

	}

}
