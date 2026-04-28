package com.javaarray;

//Find the second smallest element
public class DemoArray15 {

	public static void main(String[] args) {
		int arr[] = { 1000, 1, 100, 10 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		if (arr[0] < arr[1]) {
			System.out.println("Second smallest : " + arr[1]);
		}

//		for (int a : arr) {
//			System.out.println(a + " ");
//		}
	}

}
