package com.javafundamentals;
//import java.util.Scanner;
//public class BMICalc {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Weight : ");
//		double weight = sc.nextDouble();
//		System.out.println("Enter Height : ");
//		double height = sc.nextDouble();
//		double BMIresult = weight / (height*height);
//		System.out.println((int)(BMIresult));
//		
//	}
//
//}

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter weight in kilograms (e.g., 70.5): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in meters (e.g., 1.75): ");
        double height = sc.nextDouble();

        // BMI Calculation
        double bmi = weight / (height * height);

        // Type casting BMI to int
        int finalBMI = (int) bmi;

        // Output
        System.out.println("\n=== BMI RESULT ===");
        System.out.println("BMI (double)   : " + bmi);
        System.out.println("BMI (int cast) : " + finalBMI);

        sc.close();
    }
}
