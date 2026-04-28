package com.staticinstance;

public class StaticInstanceDemo4 {
	static {
		System.out.println("STATIC BLOCK 1");
		System.out.println();
	}
	
	static {
		System.out.println("STATIC BLOCK 2");
		System.out.println();
	}
	{
		System.out.println("INSTANCE BLOCK 1");
		System.out.println();
	}
	{
		System.out.println("INSTANCE BLOCK 2");
		System.out.println();
	}
	StaticInstanceDemo4(){
		System.out.println("Contructor executed ");
		System.out.println();
	}
	public static void main(String[] args) {
		StaticInstanceDemo4 si = new StaticInstanceDemo4();
	}

}
