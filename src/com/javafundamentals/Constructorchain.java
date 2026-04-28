package com.javafundamentals;

public class Constructorchain {
	static int id;
	static String name;
	static int age;
	Constructorchain(){
		this(id);
		
		 id=103;
		 name="Nithish";
		 age=23;
		
		System.out.println(" NO arg constructor called !");
		
		display();
		}
	Constructorchain(int id){
		this(id,name);
		
		id =102;
		name="Nithish";
		age=0;
		this.id=id;
		
		System.out.println("1 arg constructor called !");
		
		display();
	}
	Constructorchain(int id ,String name){
		this(id,name,age);
		id=101;
		name="unknown";
		age=0;
		this.id=id;
		this.name=name;
		
		System.out.println(" 2 arg constructor called !");
		
		display();
	}
	Constructorchain(int id,String name,int age){
		id=0;
		name="Unknown";
		age=0;
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println("3 arg constructor called !");
		display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorchain cch = new Constructorchain();
	}
	void display() {
		System.out.println("Student id is : "+id);
		System.out.println("Student id is : "+name);
		System.out.println("Student id is : "+age);
		System.out.println("****************************");
	}

}

