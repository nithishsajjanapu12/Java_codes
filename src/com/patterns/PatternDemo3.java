package com.patterns;
//     *
//    ***
//   *****
//  *******
// *********
public class PatternDemo3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			// print spaces
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			// prints stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
