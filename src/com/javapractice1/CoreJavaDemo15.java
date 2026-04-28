package com.javapractice1;

public class CoreJavaDemo15 {
	int id;
	String name;
	CoreJavaDemo15(int id,String name){
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		CoreJavaDemo15 cd1 = new CoreJavaDemo15(101,"Nithish");
		cd1.display();
	}
	void display() {
		System.out.println("Student id is :"+id);
		System.out.println("Student name is : "+name);
	}

}
