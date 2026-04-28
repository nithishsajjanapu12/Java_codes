package com.oops.exception;

public class ExDemo8 {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8 };
		int sum = 0;
		try {
			for (int i = 0; i <= arr.length; i++) {
				sum = sum + arr[i];
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("In catch");
		} catch (Exception e) {
			System.out.println("In Catch");
		} finally {
			System.out.println(sum);
		}

	}
}
