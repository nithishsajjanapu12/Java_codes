package com.javapractice2;
//Show how constructor overloading improves flexibility using a real-world example
public class FunDemo16 {
	int id;
	String name;
	FunDemo16(){
		System.out.println("No arg constructor called !");
	}
	FunDemo16(int id,String name){
		this();
		this.id = id;
		this.name=name;
		System.out.println("parameterized constructor called !");
		
	}
	public static void main(String[] args) {
		FunDemo16 fd = new FunDemo16(101,"Nithish");
		fd.display();
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	}

}
