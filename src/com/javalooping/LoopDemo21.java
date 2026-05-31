package com.javalooping;

//0 1 1 2 3 5 8 13 21 34 55 89
public class LoopDemo21 {

	public static void main(String[] args) {

		
		int first = 5;
		int second = 8;

		System.out.print("Fibonacci series from 5 to 50: ");

		while (first <= 50) {
			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;
		}

	}

}
