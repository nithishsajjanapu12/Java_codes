package com.oops.inheritance;

abstract class Demo22 {
	abstract void sound();
}

public class InheritanceDemo5 {

	public static void main(String[] args) {
		Demo22 d2 = new Demo22() {

			void sound() {
				System.out.println("Anonymous");
			}
		};
		d2.sound();

	}
}