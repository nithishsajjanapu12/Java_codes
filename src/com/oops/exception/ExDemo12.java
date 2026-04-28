package com.oops.exception;

//Invalid Amount Exception and Insufficient Exception
import java.util.Scanner;

public class ExDemo12 {

	public static void main(String[] args) throws ExDemo13InsufficientAmountException, ExDemo11_InvalidAmountException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your balance :");

		double balance = sc.nextDouble();
		withdrawAmount(balance);
	}

	static void withdrawAmount(double balance)
			throws ExDemo13InsufficientAmountException, ExDemo11_InvalidAmountException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to WithDraw : ");
		double amount = sc.nextDouble();
		if (amount <= 0) {
			throw new ExDemo11_InvalidAmountException("ExDemo11_InvalidAmountException ");
		}
		if (amount > balance) {
			throw new ExDemo13InsufficientAmountException("ExDemo13InsufficientAmountException ");
		}
		balance = balance - amount;
		System.out.println("Withdrawal successful. Remaining Balance :" + balance);

	}

}
