package com.javapractice;

public class TestOperatorDemo4 {

	public static void main(String[] args) {
		int a = 6;
					//	!(6 < 10) && ( 6 > 5) ->  !(true)&&(true)  ->  false&&true -> false
		boolean result = !(a < 10) && (a > 5);
		System.out.println(result);
	}

}
