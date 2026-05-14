package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n) {
			if (n % i == 0) {
				System.out.print(i + " ");
				sum=sum + i;
			}
			i++;
		}
		System.out.println();
		System.out.println("All Factors sum is : "+sum);
	}

}
