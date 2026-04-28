package com.javapractice;

public class Operator1 {

	public static void main(String[] args) {
		int x = 1;
		int result = x++ - ++x + x + x + x++ - x-- + --x - ++x;// 1 - 3 + 3 + 3 + 3 - 4 + 2 - 3
		System.out.println(result + " "+x);
		int a = '5';
		System.out.println(a);
		char c = '5';
		System.out.println(c);
		int _1=100;
		System.out.println(_1+" ");
	}

}
