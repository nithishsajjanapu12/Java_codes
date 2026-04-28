package com.javapractice;

public class ConstructorDemo4 {
	int id;
	String name;
	double salary;
	public ConstructorDemo4(){
		System.out.println("NO ARG CONSTRUCTOR called !");
		show();
		System.out.println("*****************************");
	}
	public ConstructorDemo4(int id) {
		this();
		System.out.println("1 arg constructor called !");
		this.id=id;
		show();
		System.out.println("*******************************");
	}
	public ConstructorDemo4(int id,String name) {
		this(101);
		System.out.println("2 arg constructor called !");
		this.name=name;
		show();
		System.out.println("***********************************");
	}
	public ConstructorDemo4(int id,String name,double salary) {
		this(0,"Nithish");
		this.salary= salary;
		System.out.println("3 arg constructor called !");
		show();
		System.out.println("*******************************");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ConstructorDemo4 cd = new ConstructorDemo4(0,"null",23000.0);
	}
	void show() {
		System.out.println("EMP id : "+id);
		System.out.println("EMP name : "+name);
		System.out.println("EMP salary : "+salary);
	}
}
