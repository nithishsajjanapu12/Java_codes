package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for sum of first natural numbers : ");
		int n = sc.nextInt();
		
		int sum=0;
		int i=1;
		while(i<=n) {
			sum = sum +i;
			i++;
		}
		
		System.out.println("Sum is " +sum);
	}

}
