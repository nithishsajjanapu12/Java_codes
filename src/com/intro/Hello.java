package com.intro;

public class Hello {
	
	//static method creating 
	static void display1(){
		System.out.println("display1 Static method 1");	
		display2();
	}
	
	//instance method creating
	void show1(){
		
		System.out.println("show1 Instance method 1");
		
		show2();
		
	}
	
	//static method creating
	static void display2(){
		System.out.println("display2 Static method 2");
	    Hello h= new Hello();
	    h.show1();
		
		
	}
	//instance method creating
	void show2(){
		System.out.println("show2 Instance method 2");
		
	}
	static{
		display1();
	}
	public static void main(String[] args) {
	
	}

}
