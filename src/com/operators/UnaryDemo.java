package com.operators;

public class UnaryDemo {
// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		
		
		int b=4;
		
//		System.out.println(a++);//3
//		System.out.println(++a);//5
//		System.out.println(b++);//4
//		System.out.println(--b);//4
//		System.out.println(a++);//5
//		System.out.println(a++);//6
//		int res = a++ // + ++a - b++ - --b + a++ - a++; 
		int res = a++ + ++a - b++ - --b + a++ - a++;
//		6 + 8 - 4 - 4 + 8 - 9 
		System.out.println("*******************************");
		System.out.println(res);
	}

}
