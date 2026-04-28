package com.javastring;

import java.util.Scanner;

public class StringDemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			str1 = ch+str1;
		}
		System.out.println("Reversed Stirng : " + str1);
	}

}
