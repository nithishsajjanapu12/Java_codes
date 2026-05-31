package com.methodcalling;

public class MethodCall1 {
	public void printEven(int start,int limit) {
		if(start>limit) {
			return;
		}
		
		System.out.println(start);
		printEven(start+2,limit);
		
	}
	public static void main(String[] args) {
		int limit =20;
		MethodCall1 m = new MethodCall1();
		m.printEven(2, limit);
	}

}
