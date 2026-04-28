package com.staticinstance;

public class StaticInstanceDemo6 {
	static int x = 10;

	static {
		x = 20;
		System.out.println(x);
	}
	static {
		x = 30;
	}

	public static void main(String[] args) {
		System.out.println(x);
	}

}
