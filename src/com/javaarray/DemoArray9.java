package com.javaarray;
//sum of value of array elements
public class DemoArray9 {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 7, 2, 7 };
		System.out.println("Main method started");
		int i = 0;
		int sum = 0;
		while (i < arr.length) {
			sum = sum+ arr[i] ;
			
			i++;
		}
		System.out.println("Sum is : " + sum);
	}

}
