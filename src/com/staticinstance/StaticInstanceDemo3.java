package com.staticinstance;

public class StaticInstanceDemo3 {
	//instance variables
	String accountHolder;
	double balance;
	///static variable (shared by all accounts)
	static double interestRate = 0.05;  // 5% interest
	//constructor
	StaticInstanceDemo3(String accountHolder,double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	//Method to calculate interest
	double calculateInterest() {
		return balance * interestRate;
	}
	public static void main(String[] args) {
		
		//Creating two accounts
		StaticInstanceDemo3 acc1 = new StaticInstanceDemo3("Raghava",25000.00);
		StaticInstanceDemo3 acc2 = new StaticInstanceDemo3("Sidhu",34000.00);
		
		//Calculating interest
		System.out.println(acc1.accountHolder + " Interest : "+ acc1.calculateInterest());
		System.out.println(acc2.accountHolder + " Interest : "+ acc2.calculateInterest());
	}

}
