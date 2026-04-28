package com.oops.inheritance;

abstract class Demo23 {
	abstract void sound();
}

class Demo21 extends Demo23 {
	void sound() {
		System.out.println("Bark");
	}
}

public class InheritanceDemo4 {

	public static void main(String[] args) {
		Demo23 d3 = new Demo21();
		d3.sound();
	}

}
