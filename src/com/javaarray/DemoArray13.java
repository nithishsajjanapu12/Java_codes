package com.javaarray;

//check if an array is sorted
public class DemoArray13 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int arr[] = { 6, 4, 3, 2, 5, 1 };
		
		for(int j=0;j<arr.length-1;j++) {
		  for (int i = 0; i < arr.length -1; i++) {
			  if (arr[i] > arr[i + 1]) {
				  int temp = arr[i];
				  arr[i] = arr[i+1];
				  arr[i+1] = temp;
			  }
		  }
		}
		
		
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
