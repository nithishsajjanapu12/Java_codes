package com.patterns;

//******
// *****
//  ****
//   ***
//    **
//     *
public class PatternDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int n = 6;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
