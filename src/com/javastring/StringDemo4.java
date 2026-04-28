package com.javastring;

import java.util.Scanner;

public class StringDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		String str1 = str.toUpperCase();
		System.out.println(str1);
	}

}
