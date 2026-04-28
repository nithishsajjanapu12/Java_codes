package com.patterns;

public class PatternDemo9 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
