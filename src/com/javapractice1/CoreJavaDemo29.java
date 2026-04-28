package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo29 {
	  void displayCountDigit(int n) {
	        int count = 0;
	        while (n > 0) {
	            n = n / 10;
	            count++;
	        }
	        System.out.println("count : " + count);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        CoreJavaDemo29 cd = new CoreJavaDemo29();
	        cd.displayCountDigit(n);
	        sc.close();
	    }

}
