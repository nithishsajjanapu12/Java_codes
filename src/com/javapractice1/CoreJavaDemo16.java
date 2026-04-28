package com.javapractice1;
//constructor overloading
//this keyword is not required because there is no naming conflict 
//between instance variables and constructor parameters.
public class CoreJavaDemo16 {
        int id ;
		String name;
		int age;
		//Default constructor
		CoreJavaDemo16(){
			id=0;
			name = "unknown";
			age=0;
			System.out.println("Default constructor called");
		}
		//constructor with two parameters
		CoreJavaDemo16(int i,String n){
			id= i;
			name = n;
			age=0;
			System.out.println("constructor with id and name called");
		}
		//constructor with three parameters
		CoreJavaDemo16(int i,String n,int a){
			id =i;
			name = n;
			age= a;
			System.out.println("Constuctor with id,name ,and age called ");
		}
		void display() {
			System.out.println(id+" "+name+" "+age);
		}
	public static void main(String[] args) {
		
		CoreJavaDemo16 c1 = new CoreJavaDemo16();
		CoreJavaDemo16 c2 = new CoreJavaDemo16(101,"Alice");
		CoreJavaDemo16 c3 = new CoreJavaDemo16(102,"Bob",20);
		c1.display();
		c2.display();
		c3.display();

	}

}
