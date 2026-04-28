package com.javapractice2;
//Take two integers and Swap them without using a third variable
public class FunDemo3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		System.out.print("Before swap a is : "+a+"  ");
		System.out.println("Before swap b is : "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.print("After  swap a is : "+a+"   ");
		System.out.print("After  swap b is : "+b);
		
		
	}

}
