package com.javapractice;
//Create a class Parent and a class Child that extends it.
//
//Print messages from both constructors.
//
//❓Question: Why does the parent constructor run even if not called explicitly?
public class ConstructorDemo2 {
	int id;
	ConstructorDemo2(){
		System.out.println("ConstructorDemo  no args constructor called from parent class");
	}
	ConstructorDemo2(int id){
		this.id=id;
		System.out.println("ConstructorDemo  no args constructor called from parent class");
		System.out.println(id);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method enterd in parennt class");
	}

}
class cdemo extends ConstructorDemo2 {
	cdemo(){
		super(34);
		System.out.println("cdemo constructor from child class");
	}
	public static void main(String args[]) {
		System.out.println("Main method started");
		cdemo  cd = new cdemo();
		
	}
}