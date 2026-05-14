package com.practiceloop;

interface Engine {
	void start();
}

class PetrolEngine implements Engine {
	public void start() {
		System.out.println("Petrol engine started");
	}
}

class ElectricEngine implements Engine {
	public void start() {
		System.out.println("Electric engine started");
	}
}

class Car {
	Engine engine;

	// Dependency Injection via constructor
	Car(Engine engine) {
		this.engine = engine;
	}

	void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
}

public class PracticeLoopDemo35 {

	public static void main(String[] args) {
		Engine e = new PetrolEngine(); // or new ElectricEngine()
		Car car = new Car(e);
		car.drive();
	}

}