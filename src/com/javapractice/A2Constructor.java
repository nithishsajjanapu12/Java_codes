package com.javapractice;

public class A2Constructor {
	A2Constructor(){
		this(10);
		System.out.println("A default");
	}
	A2Constructor(int x){
		super();
		this();   
		//here two constructors calling each other gets the stack overflow error
		System.out.println("A parameter : "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2Constructor a2= new A2Constructor();
	}

}
