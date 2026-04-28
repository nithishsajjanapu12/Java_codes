package com.javaarray;

//reverse an array
public class DemoArray12 {

	public static void main(String[] args) {
		System.out.println("MAin method started");
		int arr[] = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}








































