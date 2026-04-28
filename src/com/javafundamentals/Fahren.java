package com.javafundamentals;
import java.util.Scanner;
public class Fahren {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fahrenheit : ");
		double fahrenheit= sc.nextDouble();
		double celsius = (((fahrenheit - 32) * 5.0) /9.0);
		System.out.println("Enter Celsius : "+celsius);
		double celsi = sc.nextDouble();
		double fahren = ((celsi * 9.0 )/ 5.0) +32;
		System.out.println("Temperature in fahrenheit : "+fahren);
		sc.close();
	}
}
