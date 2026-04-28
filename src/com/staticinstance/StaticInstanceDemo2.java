package com.staticinstance;

public class StaticInstanceDemo2 {
	String name;
	static String company = "ABC Company";

	StaticInstanceDemo2(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		StaticInstanceDemo2 dd = new StaticInstanceDemo2("Ramana");
		StaticInstanceDemo2 dd1 = new StaticInstanceDemo2("krishna");
		StaticInstanceDemo2 dd2 = new StaticInstanceDemo2("Balaram");
		// print initial details
		System.out.println("Before changing company : ");
		dd.display();
		dd1.display();
		// change static variable
		StaticInstanceDemo2.company = "InfoTech";

		// print details after change
		System.out.println("After changing company : ");
		dd.display();
		dd1.display();
		System.out.println();
	}

	void display() {
		System.out.println("Name : " + name + ",Company : " + company);
	}

}
