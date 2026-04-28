package com.javafundamentals;
import java.util.Scanner;

public class Insurance {
	static Scanner sc = new Scanner(System.in);
	static String s= "Infosys";
	static double insurance_fee = 500;
	static double amount = 1500;
	
	
	static void welcome() {
		System.out.println("Welcome to INFOSYS INSURANCE COMPANY");
	}
	static void daily_rate() {
		double x = (Insurance.amount);
		System.out.println("Daily  Rate : "+x);
		int y  = sc.nextInt();
		base_amount(y);
	}
	static void insurance() {
		double y= (Insurance.insurance_fee);
		System.out.println("Insurance fee : "+y);
		
	}
	
	static void base_amount(int days) {
		double base_amount = (days * amount);
		System.out.println("Base Amount is : "+base_amount);
		total_balance(base_amount);
	}
	static void total_balance(double base_amount) {
		double a = (base_amount + Insurance.insurance_fee); 
		System.out.println("Total Balance : "+a);
	}
	public static void main(String[] args) {
		welcome();
		insurance();
		daily_rate();
		
		
	}

}
