package com.javafundamentals;
import java.util.Scanner;
public class Bank2 {
	static double balance = 5000;
	
	static void deposit(int amount) {
		double d_amount=balance+amount;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println();
		System.out.println("Deposit Successful!!!");
		System.out.println("After Deposit.. your account balance is : "+d_amount);
		System.out.println();
		System.out.println("*******************************************");
	}
	static void withdraw(int amount) {
		double w_amount=balance-amount;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println();
		System.out.println("Deposit Successful!!!");
		System.out.println("After Withdraw.. your account balance is : "+w_amount);
		System.out.println();
		System.out.println("*******************************************");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount :");
		int amount =sc.nextInt();
		//deposit(amount);
		withdraw(amount);
		sc.close();
	}
	static void check_balance() {
		System.out.println("Your Balance is : "+balance);
	}

}
