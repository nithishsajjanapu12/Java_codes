package com.arrayjava;

public class ArrayDemo23 {
//input [1,2,3,4] output [9,8,7,6]
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int result[] = new int[a.length];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum is : " + sum);

		for (int j = 0; j < a.length; j++) {
			result[j] = sum - a[j];
		}
		System.out.print("[");
		for (int r : result) {
			System.out.print(r + " ");
		}
		System.out.println("]");

	}

	
	
	
}
