package com.staticinstance;

public class StaticInstanceDemo7 {
	static {
		System.out.println("Static block");
		StaticInstanceDemo7 si = new StaticInstanceDemo7();
	}
	{
		System.out.println("Instance block");
	}

	StaticInstanceDemo7() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("MAIN");
	}

}
