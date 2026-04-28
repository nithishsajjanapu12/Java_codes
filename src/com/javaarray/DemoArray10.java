package com.javaarray;
//avg of elements of array
public class DemoArray10 {

	public static void main(String[] args) {
		System.out.println("MAin method started");
		int arr[] = { 1, 5, 2, 5, 7 };
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum is : " + sum);
		System.out.println("Avg is : " + (sum / arr.length));

	}

}







































