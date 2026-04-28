package com.javapractice;

public class TestConstructor {
	TestConstructor(int a,double b){
		System.out.println("int-double");
	}
	TestConstructor(double a,int b){
		System.out.println("double-int");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor t = new TestConstructor(10,20);
		//we should pass matched argument type if there is constructor overloading
	}

}
