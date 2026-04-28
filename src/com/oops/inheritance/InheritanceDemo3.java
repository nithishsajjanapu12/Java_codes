package com.oops.inheritance;

class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	
	 void sound() {
		System.out.println("Dog barks");
	}
}

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Dog d = new Dog();               //    Normal Child Object
		d.sound();

		Animal a = new Dog();            //    UpCasting Object   ->  Object type has priority instead of Reference type
		a.sound();
		
		Animal a2 = new Animal();        //    Normal Parent Object
		a2.sound();

		
	}

}
