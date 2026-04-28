package com.staticinstance;

class Parent {
	static {
		System.out.println("parent static");
	}
	{
		System.out.println("parent Instance");
	}

	Parent() {
		System.out.println("Parent Constructor");
	}
	 void show() {
		System.out.println("HI parent");
	}
}

public class StaticInstanceDemo8 extends Parent {
	static {
		System.out.println("Child static");
	}
	{
		System.out.println("Child Instance");
	}

	StaticInstanceDemo8() {
		System.out.println("Child constructor");
	}
	void show() {
		System.out.println("HEllo child");
	}

	public static void main(String[] args) {
		Parent si = new StaticInstanceDemo8();
		si.show();
	}
}
