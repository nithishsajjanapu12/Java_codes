package com.javafundamentals; // withdraw , check balance ,deposit are methods to be implemented
import java.util.Scanner;
public class Bank1 {
	static Scanner sc = new Scanner(System.in);
	static double acc_balance= 15000;
	static void withdraw() {
		System.out.println("Please enter the amount to be withdraw : ");
		double w_amount = sc.nextDouble();
		double after_wamount = acc_balance - w_amount;
		System.out.println("Successfully amount is Withdrawn  !!! ");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println();
		check_balance(after_wamount);
	}
	static void deposit() {
		System.out.println("Please enter the amount to be deposited to your account :");
		double d_amount = sc.nextDouble();
		double after_damount = acc_balance + d_amount;
		System.out.println("Successfully amount is Deposited !!!");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println();
		check_balance(after_damount);
	}
	static void check_balance(double acc_balance) {
		System.out.println("Your current balance is :"+acc_balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deposit();
	}

}
