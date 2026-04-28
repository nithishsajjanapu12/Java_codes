package com.javapractice;

public class TestOperatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
	//int result =  1 - 3 + 3 + 3 + 3 - 4 + 2 - 3
		int result = x++  - ++x + x + x + x++ - x-- + --x - ++x; //2
		System.out.println(result + " "+x);// 2 3
	}

}
