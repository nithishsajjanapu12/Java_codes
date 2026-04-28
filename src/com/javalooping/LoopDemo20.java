package com.javalooping;

import java.util.Scanner;

public class LoopDemo20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		int count = 0;
		while (a > 0) {

			a = a / 10;
			count++;
		}
		int rev = 0;
		System.out.println("Count : " + count);
		for (int i = 1; i <= count; i++) {
			int digit = a % 10;
			rev = rev * 10 + digit;
			a = a / 10;

		}
		System.out.println("Rev : " + rev);
	}

}
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;   // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            number = number / 10;     // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}