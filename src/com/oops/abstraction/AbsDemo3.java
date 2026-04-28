package com.oops.abstraction;

abstract class Payment {
	abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
	void pay(double amount) {
		System.out.println("Paid " + amount + "/- Using Credit Card");
	}
}

class UPIPayment extends Payment {
	void pay(double amount) {
		System.out.println("Paid " + amount + "/- Using UPI");
	}
}

public class AbsDemo3 {
	public static void main(String[] args) {
		Payment p;
		p = new CreditCardPayment();
		p.pay(5000.00);

		p = new UPIPayment();
		p.pay(2000.00);
	}
}
