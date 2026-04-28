package com.javastring;

import java.util.Scanner;
import java.lang.String;

public class StringDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String  str = sc.nextLine();
		int count=0;
		int count1=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
				count++;
			} else {
				count1++;
			}
		}
		System.out.println("Vowels count : " + count);
		System.out.println("Consonants count : " + count1);
	}

}
