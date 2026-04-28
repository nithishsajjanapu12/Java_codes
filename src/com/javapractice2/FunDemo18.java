package com.javapractice2;

class Address {
	String city;
	String state;

	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public void displayAddress() {
		System.out.println(city + "," + state);
	}
}

class Person {
	String name;
	int age;
	Address address;

	Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void displayPerson() {
		System.out.println("Name : " + name);
		System.out.println("age : " + age);
		System.out.println("Address : ");
		address.displayAddress();
	}
}

public class FunDemo18 {

	public static void main(String[] args) {
		Address addr = new Address("New york", "NY");
		Person p1 = new Person("John Doe", 30, addr);
		p1.displayPerson();
	}

}
