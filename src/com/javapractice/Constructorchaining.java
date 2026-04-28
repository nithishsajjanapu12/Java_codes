package com.javapractice;

public class Constructorchaining {
	int id;
	String name;
	//parameterized constructors
	public Constructorchaining(int id,String name,int age) {
		this.id = id;
		this.name = name;
		System.out.println(name + " - age : " +age);
	}
	public Constructorchaining() {    //we dont use final ,synchronized,static,abstract modifiers
		this(18,"kohli",34);
		System.out.println("No arg Constructors");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		//Creating an object
		Constructorchaining cc = new Constructorchaining();
		System.out.println(cc.id);
		System.out.println(cc.name);
		Constructorchaining ccc = new Constructorchaining(7,"Dhoni",40);
		System.out.println(ccc.id);
		System.out.println(ccc.name);
		
		
	}
	static {
		System.out.println("Hello static block ");
	}
	{
		System.out.println("Hello instance block ");
	}
}
