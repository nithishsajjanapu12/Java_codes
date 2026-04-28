package com.javapractice;

public class Aconstructor1 extends Object{
	Aconstructor1(){
		this(10);
		System.out.println("A default");
	}
	Aconstructor1(int x){
		super();
		System.out.println("A parameter : "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Aconstructor1();
	}

}
