package com.javapractice;

public class DemoConstructor {
	private DemoConstructor(){
		System.out.println("Private Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoConstructor();
		DemoConstructor d = new DemoConstructor();
	}

}
