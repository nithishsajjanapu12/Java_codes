package com.oops.inheritance;

class A {
	int x = 10;

	void show() {
		System.out.println(x + " ");
	}
}

class B extends A {
	int x = 20;

	void show() {
		System.out.println(super.x + " ");
	}

	
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		A a = new B();

		B b = (B) a;
	}

}
