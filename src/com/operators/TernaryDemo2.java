package com.operators;

import java.util.Scanner;

public class TernaryDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();

		char result = (marks > 90) ? 'O' : (marks > 80) ? 'A' : (marks > 70) ? 'B' : (marks > 60) ? 'C' : (marks > 50) ? 'D' : (marks >= 40) ? 'P' : 'F';
		System.out.println("result" + result);
		sc.close();
	}

}
