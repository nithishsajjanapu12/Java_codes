package com.javapractice2;

public class FunDemo10 {

	public static void main(String[] args) {
		int [] a = {2,4,6};
		for(int x : a) {
			x = x * 2;
		}
		for(int x : a) {
			System.out.print(x + " ");
		}
	}

}
