package com.staticinstance;

//1️⃣ Object Counter
//
//Write a class Car that:
//
//Has instance variable model
//
//Has static variable totalCars
//
//Increments totalCars inside constructor
//
//Prints total cars created
//
//👉 Create 3 objects and print total.
public class StaticInstanceDemo1 {
	String model;
	static int totalCars = 0;

	StaticInstanceDemo1() {
		totalCars++;
	}

	public static void main(String[] args) {
		StaticInstanceDemo1 sd = new StaticInstanceDemo1();
		StaticInstanceDemo1 sd1 = new StaticInstanceDemo1();
		StaticInstanceDemo1 sd2 = new StaticInstanceDemo1();
		System.out.println(totalCars); // 3
	}

}
