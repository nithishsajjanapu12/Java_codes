package com.javaarray;

import java.util.Scanner;

public class DemoArray18 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int arr[] = { 2, 3, 5, 7 };

		int target = 8;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("Index of the elements are " + i + "," + j);
				}
			}
		}
	}

}

//public class DemoArray18 {
//
//    public static void main(String[] args) {
//        System.out.println("main method started");
//
//        int arr[] = {2, 3, 5, 7};
//        int target = 8;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println("Index of the elements are " + i + "," + j);
//                }
//            }
//        }
//    }
//}