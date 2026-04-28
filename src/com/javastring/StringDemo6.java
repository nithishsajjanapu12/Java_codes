package com.javastring;

import java.util.Scanner;

public class StringDemo6 {

	public static void main(String[] args) {
		System.out.println("MEain method started");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String temp = s;
		String str="";
		for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				str = str+ch;
				
		}
		System.out.println("String : "+str);
		if(str.equals(temp)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}

}
