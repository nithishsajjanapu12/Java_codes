package com.practiceloop;

import java.util.Scanner;

//153 = 1^3 + 5^3 + 3^3 = 153
public class PracticeLoopDemo15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp=n;
		int temp1 = n;

		int count = 0;
		while (temp1 > 0) {
			temp1 = temp1 / 10;
			count++;
		}
		System.out.println("Count is : " + count);
		int sum = 0;
		while (n > 0) {
		    int digit = n % 10;  
		    sum += (int) Math.pow(digit, count);
		    n = n / 10;           
		}
		System.out.println("Sum is : "+sum);
		if(sum==temp) {
			System.out.println("It is armstrong number ");
		}else {
			System.out.println("It is not armstrong number ");
		}
	}

}
