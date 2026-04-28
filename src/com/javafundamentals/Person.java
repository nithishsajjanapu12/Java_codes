package com.javafundamentals;

public class Person {
	String name;
	public Person(){
		System.out.println("No arg constructor called from person");
	}
	public Person(String name){
		
		this.name=name;
		System.out.println("1 arg parameterized constructor called from Person");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}

class Employees extends Person{
	double salary;
	int Empid;
	
	public Employees(double salary,int Empid,String name){
		super(name);
		this.salary = salary;
		this.Empid=Empid;
		System.out.println("3 arg parameterized constructor  called from Employees ");
	}
	
	public static void main(String[] args) {
		Employees e1=new Employees(20000, 108,"Nithish");
		e1.display();
	}
	void display() {
		System.out.println("Employee name :"+name);
		System.out.println("Employee salary : "+salary);
		System.out.println("Employee Empid : "+Empid);
	}
}