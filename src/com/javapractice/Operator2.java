package com.javapractice;

public class Operator2 {
	protected void finalize() {
		System.out.println("finalize method");
	}
	public static void main(String[] args) {
		new Operator2();
		System.out.println("MAin end");
		System.gc();
		
	}

}
