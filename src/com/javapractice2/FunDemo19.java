package com.javapractice2;

public class FunDemo19 {

	public static void main(String[] args) {
		int arr[] = { 1,2,5,7};
		int count =0;
		for(int i=0; i< arr.length;i++) {
			System.out.println(count++);
			System.out.println(arr[i]+" ");
		}
		System.out.println("Final count is : "+count);
	}

}

