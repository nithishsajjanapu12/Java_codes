package com.javaarray;

//Input: {10, 20, 30, 40}
//Output: {10, 10, 10, 10}
public class DemoArray7 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };

		System.out.println("MAin Method started ");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 10) {
				arr[i] = 10;
				System.out.println(arr[i]);
			} else if (arr[i] == 10) {
				System.out.println(arr[i]);
			}
		}

	}

}
