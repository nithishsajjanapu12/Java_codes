package com.arrayjava;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 5, 4, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}
}