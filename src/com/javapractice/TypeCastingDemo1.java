package com.javapractice;
//import java.util.Scanner;
public class TypeCastingDemo1 {
// byte -> short -> int -> long -> float -> double 
	public static void main(String[] args) {
		// TODO Auto-generated method stub long float double
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter a number (as a String) :");
		//String numberString=sc.nextLine();    //takes input as string
		String numberString = "7";
		try {
			//converting string to integer
			int number = Integer.parseInt(numberString);
			System.out.println("The Integer value is : "+(number + number));
			
		}catch(NumberFormatException e) {
			//If the input us not a valid integer
			System.out.println("Invalid input! Please enter a valid number.");
		}
		finally {
			System.out.println("Finally  encountered a solution");
		}
		
	}

}
