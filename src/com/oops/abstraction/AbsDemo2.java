package com.oops.abstraction;



abstract class Vehicle{
	abstract void start(); //abstract method
}
class  Car extends Vehicle{
	void start() {
		System.out.println("Car starts with a key");
	}
}
public class AbsDemo2 {

	public static void main(String[] args) {
		Vehicle v ;
		v = new Car();
		
		v.start();
	}

}
