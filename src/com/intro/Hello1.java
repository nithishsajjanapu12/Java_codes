package com.intro;

import java.util.Scanner;

public class Hello1 {

	public static void main(String[] args) {
		System.out.println("Mainmethod started in hello1");
		Scanner sc = new Scanner(System.in);
		var x= 10/3;
		System.out.println("Hello1 called ");
		System.out.println("Main method ended in hello1");
	}

}
class Hello2 {
	
	public static void main(String [] args) {
		System.out.println("Main method started in hello2");
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello2 called");
		System.out.println("Main method ended in hello2");
	}
}