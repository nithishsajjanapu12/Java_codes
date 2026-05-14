package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers until the sum of them becomes greater than 100:");
		int sum = 0;
		while (true) {
			int n = sc.nextInt();
			if (n < 100) {
				sum = sum + n;
			}
			
			if(sum > 100) {
				System.out.println("Sum of numbers exceeded 100 " + " So, Sum you got is : "+ sum + " > 100");
				break;
			}
		}
	}

}
