package com.intro;
import java.util.Scanner;
public class ModuloDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a : ");
		int a = sc.nextInt();
		System.out.println("Enter number b : ");
		int b = sc.nextInt();
		
		int modulus = a % b;
		System.out.println("Modulus of a : "+modulus);
		
		int division = a / b;
		System.out.println("Division of b : "+division);
		sc.close();
		
	}

}
