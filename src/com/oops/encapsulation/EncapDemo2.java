package com.oops.encapsulation;

public class EncapDemo2 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		Face d = new Dv();
		d.sum(a, b);

	}
}

interface Face {

	public int sum(int a, int b);

}

class Dv implements Face {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}