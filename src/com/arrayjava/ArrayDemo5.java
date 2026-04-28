package com.arrayjava;
//Problem: Given an array of integers, find the maximum product of any two numbers.

//Example:
//Input: [3, 5, -2, 8, -1]
//Output: 16 (8 × 2)

//Hint: Sort the array or track the two largest and two smallest numbers.
public class ArrayDemo5 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, -2, 8, -1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j + 1]) {
					int temp1 = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp1;
				}
				System.out.print(arr[i] + " ");
			}
		}
	}
}
