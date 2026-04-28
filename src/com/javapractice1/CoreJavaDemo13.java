package com.javapractice1;

import java.util.Scanner;

public class CoreJavaDemo13 {
//print all factors of a number 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println("Factors of "+a+" is "+i);
			}
		}
	}

}
class CoreJavaDemo101{
	static void display(int a,int b) {
		System.out.println("Factors of "+a+" is "+b);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		
		for(int i=1 ;i<=c;i++) {
			if(c%i==0) {
				display(c,i);
			}
		}
		sc.close();
	}
	
}
class CoreJavaDemo103{
	public static void main(String[] args) {
		System.out.println("Hello world !");
	}
}
