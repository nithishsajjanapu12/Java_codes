package com.javapractice;

public class Companyproduct {
	int id ;
	String name;
	double price;
	public Companyproduct() {
		id=0;
		name = "Unknown";
		price = 0.0;
		System.out.println("No arg / default constructor called !");
		System.out.println("****************************************");
		this(100.0);
		display();
	}
	public Companyproduct(double price) {
		id=0;
		name = "Unknown";
		this.price = price;
		System.out.println("1 arg parameterized constructor called ! ");
		System.out.println("********************************************");
		display();
	}
	public Companyproduct(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price = price;
		System.out.println("3 arg parameterized constructor called ! ");
		System.out.println("*********************************************");
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Companyproduct cp = new Companyproduct();
		System.out.println("****************************************");
		
	}
void display() {
	System.out.println("Company product id : "+id);
	System.out.println("Company product name : "+name);
	System.out.println("Company product Price : "+price);
}
}
