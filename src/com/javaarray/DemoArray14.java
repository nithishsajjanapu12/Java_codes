package com.javaarray;

//Find the second largest element
public class DemoArray14 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int arr[] = { 5, 4, 1, 2, 3 };
		for (int j = 0; j < arr.length - 1; j++) {

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			if (arr[arr.length - 1] > arr[arr.length - 2]) {

				System.out.println("Second Largest : " + arr[arr.length - 2]);
			}
		}
	}

}
