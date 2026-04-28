package com.javapractice;
//Create a class with only a parameterized constructor.
//
//Try to create an object without arguments.
//
//❓Question: Why does this fail? How can it be fixed?
public class ConstructorDemo3 {
	int id;
	String name;
	double salary;
	ConstructorDemo3(int id,String name,double salary){
		this.id= id;
		this.name=name;
		this.salary= salary;
		System.out.println("parameterized constructor called ");
		display();
	}
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("salary : "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo3 cd= new ConstructorDemo3(234,"Nithish",43000);
	}

}
