package com.javapractice;

public class Printer {
	void print() {
		Printer  p4 = new Printer();
		System.out.println("Hello");
		p4.print();
	}
	static {
		Printer p = new Printer();
		p.print();
	}
	public static void main(String[] args) {
		System.out.println("JAva is simple");
	}

}
