package com.javapractice;
//Write a program where a class has no constructor and show what constructor gets called at runtime.
public class ConstructorDemo6 {
	void show() {
		System.out.println("Method called");
	}
	public static void main(String[] args) {
		ConstructorDemo6 cd = new ConstructorDemo6(); //
		cd.show();
	}

}
