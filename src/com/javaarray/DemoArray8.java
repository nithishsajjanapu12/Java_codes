package com.javaarray;
//Minimum value in array
public class DemoArray8 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int arr[] = { 1, 2, 3, 4, 5 };
		int min = arr[0];// assume
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum ELement : " + min);
	}
}































