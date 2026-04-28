package com.arrayjava;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to enter into the array : ");
		int n= sc.nextInt();
		int [] arr = new int[n];
		
		//Accept array elements
		System.out.println("Enter the array elements  : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Accept number to search
		System.out.println("Enter the number to search : ");
		int key = sc.nextInt();
		
		int position = -1;
		
		//Linear search logic
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				position = i+ 1;
				break;
			}
		}
		//Displaying the result
		if(position!=-1) {
			System.out.println("Number found at position : "+position);
		}
		else {
			System.out.println("Number not found in the array");
		}
	}

}
//import java.util.Scanner;
//
//class LinearSearch {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // Accept array size
//        System.out.print("Enter the size of the array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        // Accept array elements
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Accept number to search
//        System.out.print("Enter the number to search: ");
//        int key = sc.nextInt();
//
//        int position = -1;
//
//        // Linear search logic
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == key) {
//                position = i + 1; // position starts from 1
//                break;
//            }
//        }
//
//        // Display result
//        if (position != -1) {
//            System.out.println("Number found at position: " + position);
//        } else {
//            System.out.println("Number not found in the array");
//        }
//
//        sc.close();
//    }
//}
//
