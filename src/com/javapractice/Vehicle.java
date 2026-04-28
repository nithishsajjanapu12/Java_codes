package com.javapractice;

public class Vehicle {
    String registrationNumber;
    double price;

    // Parameterized constructor
    Vehicle(String registrationNumber, double price) {
        this.registrationNumber = registrationNumber;
        this.price = price;
    }

    // Copy constructor
    Vehicle(String registrationNumber,Vehicle v) {
        this.registrationNumber = registrationNumber;
        this.price = v.price;
    }
}

class Car extends Vehicle{
	

	
    String model;
    String ownerName;

    // Parameterized constructor
    Car(String registrationNumber, double price, String model, String ownerName) {
        super(registrationNumber, price);
        this.model = model;
        this.ownerName = ownerName;
    }

    // Copy constructor
    Car(String registrationNumber,Car c1,String ownerName) {
        super(registrationNumber,c1); // calls Vehicle copy constructor
        this.model = c1.model;
        this.ownerName = ownerName;
    }

    public static void main(String[] args) {
        Car c1 = new Car("TG21B23", 20000000.0, "Rolls-Royce", "Rahul");
        c1.display();
        
        Car c2 = new Car("AP21Y67",c1, "Rakesh");
        c2.display();

        
    }
    
    void display() {
    	System.out.println("Car details: " + registrationNumber + " " + price +
                " " + model + " " + ownerName);
    }
}
