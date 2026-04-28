package com.javapractice;

public class Aconstructor {
	Aconstructor(){
		this(10);
		System.out.println("A default");
	}Aconstructor(int x){
		super();
		System.out.println("A parameter : "+x);
	}

	public static void main(String[] args) {

		new Aconstructor();
	}
}
