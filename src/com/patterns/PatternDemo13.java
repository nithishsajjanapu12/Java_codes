package com.patterns;
//####
//****
//####
//****
public class PatternDemo13 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			if (i % 2 == 0) {
				for(int j=0;j<4;j++) {
					System.out.print("*");
				}
			}
			else if (i % 2 != 0) {
				for(int k=0;k<4;k++) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
