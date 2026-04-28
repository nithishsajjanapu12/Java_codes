package com.intro;

public class InstanceStaticDemo1 {// BankAccount
	// instance variables(belong to each object)
	private String accountHolderName;
	private String accountNumber;
	private double balance;

	// static variables (shared by all objects)
	private static String bankName = "ABC Bank";
	private static int totalAccounts = 0;

	// constructor
	public InstanceStaticDemo1(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++; // Increment when a new account is created
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited : " + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraw amount
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Display account details
	public void displayAccountDetails() {
		System.out.println("Bank Name : " + bankName);
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Account  Number : " + accountNumber);
		System.out.println("Balance : " + balance);
		System.out.println("-----------------------------------------");

	}

	// static method to print total accounts
	public static void printTotalAccounts() {
		System.out.println("Total Accounts Created : " + totalAccounts);
	}

	public static void main(String[] args) {
		InstanceStaticDemo1 sd = new InstanceStaticDemo1("Nithish", "2H343BF34", 9000.00);
		InstanceStaticDemo1 sd1 = new InstanceStaticDemo1("Santhosh", "34JBF3U4F3", 3000.00);

		sd.deposit(3000);
		sd1.withdraw(2000);

		sd.displayAccountDetails();
		sd1.displayAccountDetails();

		InstanceStaticDemo1.printTotalAccounts();
	}

}
