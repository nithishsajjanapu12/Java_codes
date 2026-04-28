package com.javapractice;

public class Cconstructor {
	Cconstructor(){
		this(5);
		System.out.println("No arg constructor");
	}
	Cconstructor(int x){
		this("Java");
		System.out.println("Int constructor : "+x);
	}
	Cconstructor(String s){
		System.out.println("String constructor : "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cconstructor cc= new Cconstructor();
	}

}
