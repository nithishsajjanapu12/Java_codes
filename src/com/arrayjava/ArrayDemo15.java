package com.arrayjava;

public class ArrayDemo15 {

		public static void main(String[] args) {
			int[] arr = { 5, 9, 10, 11, 5, 6, 1 };
			int mid = arr.length / 2;
			//System.out.println(mid);
			for (int i = 0; i < arr.length; i++) {

				if (i < mid) {
					for (int j = i + 1; j < arr.length / 2; j++) {

						if (arr[i] < arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}

				} else if (i > arr.length / 2) {
					for (int j = i + 1; j < arr.length; j++) {

						if (arr[i] > arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}

			}
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}