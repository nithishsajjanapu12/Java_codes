package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number : ");
		int n = sc.nextInt();
		System.out.println("Multiplication table of  : "+ n );
		int i=1;
		while(i<=10) {
			System.out.println(n + " x " + i + " = "+ (n * i));
			i++;
		}
	}

}
