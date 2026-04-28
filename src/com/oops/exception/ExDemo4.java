package com.oops.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 1, 2, 3, 4, 5 };

		try {

			System.out.println("Enter a number : ");
			int a = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the String to Convert it into Number");
			String s = sc.nextLine();

			int b = Integer.parseInt(s);

			if (arr[a] / b != 0) {
				System.out.println(a);
			}
			if (a > arr.length) {
				System.out.println("OUT OF LENGTH");
			}

		} catch (ArithmeticException ae) {
			System.out.println("In Catch 1 Arithmetic Exception ");
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("In Catch 2 ArrayIndexOutOfBounds Exception ");
		} catch (NumberFormatException ne) {
			System.out.println(" In Catch 3 NumberFormat Exception ");
		} catch (InputMismatchException g) {
			System.out.println("In Catch 4 input mismattch catched");
		}
	}

}
