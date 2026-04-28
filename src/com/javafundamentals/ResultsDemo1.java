package com.javafundamentals;

public class ResultsDemo1 {
	int a= 8;
	byte b= 10;
	short s= 5;
    int y= a + b;
    int z= a * s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultsDemo1 r1 = new ResultsDemo1();
		System.out.println("Addition is : "+(r1.y));
		System.out.println("Substraction is : "+(r1.a-r1.b));
		System.out.println("Multiplicatioin is :"+(r1.z));
	}

}
