package com.operators;

import java.util.Scanner;

public class TernaryDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();
		System.out.println("Student Details : ");
		String result = (marks >= 40) ? "pass" : "fail";
		System.out.println(result);
	}

}
