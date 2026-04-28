package com.javaconditionals;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(getMonth(n));
		sc.close();
	}
		static String getMonth(int n) {
		
			return switch(n) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "August";
		case 9 -> "September";
		case 10 -> "October";
		case 11 -> "November";
		case 12 -> "December";
		default -> "Invalid month";
			};
		
		
	}
		
}

