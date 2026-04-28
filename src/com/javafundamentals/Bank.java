package com.javafundamentals;
import java.util.Scanner;

public class Bank {

    //Account Variables
    String customerName;
    long accountNumber;
    double balance = 0.0;

    //Static Admin Variable
    static double interestRate = 5.0;

    //Setup Method
    void setupAccount(String name, long accNo) {
        this.customerName = name;
        this.accountNumber = accNo;
        
    }

    //Deposit Method
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    //Withdraw Method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    //Check Balance
    double getBalance() {
        return balance;
    }

    //Calculate Interest
    double calculateInterest() {
        return balance * interestRate / 100;
    }

    //Display Account Info
    void displayInfo() {
        System.out.println("\n--- Account Info ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    //Admin: Change Interest Rate
    static void setInterestRate(double rate) {
        interestRate = rate;
        System.out.println("Interest rate updated to " + rate + "%");
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        
        b.setupAccount(name, accNo);
        b.displayInfo();
        setInterestRate(Bank.interestRate);
        b.getBalance();
        b.calculateInterest();
        sc.close();
    }
}
        
        

        // Ask user for a single method call