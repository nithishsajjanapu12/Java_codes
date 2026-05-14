package com.practiceloop;

import java.util.Scanner;

//1 +  2 + 4 + 7 + 14 = 28
public class PracticeLoopDemo16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int temp = n;

		int i = 1;
		int sum =0;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum  = sum +i;
			}
			i++;
		}
		
		if(temp==sum) {
			System.out.println("It is perfect number ");
		}else {
			System.out.println("It is not perfect number ");
		}

	}

}
