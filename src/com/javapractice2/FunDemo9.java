package com.javapractice2;
//Checks whether a number is prime
import java.util.Scanner;

public class FunDemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = checkPrime(n);
		
		 if (result) {
	            System.out.println(n + " is a prime number.");
	        } else {
	            System.out.println(n + " is not a prime number.");
	        }

	
		
	}
	static boolean checkPrime(int n) {
		boolean status  = true;
		if(n==0 || n ==1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			System.out.println("Divisor : "+i);
			if(n%i ==0) {
				System.out.println("Factor found : "+i);
				return false; // Not prime
			}
		}
		System.out.println("No factors found ");
		return true;
	}
	}

