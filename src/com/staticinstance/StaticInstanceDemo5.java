package com.staticinstance;

public class StaticInstanceDemo5 {
	static {
		System.out.println("A");
	}
	{
		System.out.println("B");
	}
	StaticInstanceDemo5(){
		System.out.println("C");
	}
	public static void main(String[] args) {
		new StaticInstanceDemo5();
		new StaticInstanceDemo5();
	}
	static {
		System.out.println("D");
	}
}
