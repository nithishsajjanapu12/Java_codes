package com.javapractice;
//constructor overloading logic
//Create a class Account with:
//
//a no-arg constructor
//
//a constructor with name
//
//a constructor with name and balance
//
//Ensure all constructors reuse logic properly without code duplication.
//
//❓Question: How can you guarantee consistent initialization?

public class ConstructorDemoAccount1 {	
	int id;
	String name;
	double balance;
	ConstructorDemoAccount1(){
		
		this("Nithish");
		System.out.println("No arg constructor called !");
		show();
		System.out.println("***********************************");
	}
	ConstructorDemoAccount1(String name){
		this.name=name;
		
		System.out.println("1 arg constructor called !");
		
		this("Nithishkumar",23000);
		show();
		System.out.println("**********************************");
	}
    ConstructorDemoAccount1(String name,double balance){
    	this.name=name;
    	this.balance=balance;
		System.out.println("2 arg constructor called !");
		show();
		System.out.println("*********************************");  
	}
    void show() {
    	System.out.println("Account id : "+id);
    	System.out.println("Account name : "+name);
    	System.out.println("Account balance : "+balance);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemoAccount1 cd= new ConstructorDemoAccount1();
//		ConstructorDemoAccount1 cda = new ConstructorDemoAccount1();
	}

}
