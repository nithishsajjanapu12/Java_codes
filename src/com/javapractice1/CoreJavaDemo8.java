package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int a = n; a >= 0; a--) { // print 10 to 0 numbers
			System.out.print(a + " ");
		}
		for (int b = 0; b <= n; b++) { // print 0 to 10 numbers
			System.out.println(b + " ");
		}
		for (int c = 1; c <= n; c++) { // print natural numbers
			System.out.print(c + " ");
		}
		for (int d = 0; d <= n; d++) { // print all even numbers between two numbers
			if (d % 2 == 0) {
				System.out.println(d + " ");
			}
		}
		for(int p=1;p<=10;p++){					//		Print the multiplication table of 5.
			System.out.println(" "+n+" * "+p+ " = "+n*p);
		}
		sc.close();
	}

}
