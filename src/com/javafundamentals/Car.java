package com.javafundamentals;

public class Car {
	//Properties
    String brand;
    int CarNo;
    //Constructor
    Car(String b,int n) {
    	brand =b;
    	CarNo =n;
    }
    void DisplayCarInfo() {
    	System.out.println("brand :"+brand+"  CarNo :"+CarNo);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c1 = new Car("Tesla",23);
        c1.DisplayCarInfo();
	}

}
