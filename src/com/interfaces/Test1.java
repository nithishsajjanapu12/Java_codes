package com.interfaces;

class CreditCardPayment implements Payment1{
	public void pay() {
		System.out.println("Payment done using credit card ");
	}
}

class UPIPayment implements Payment1{
	public void pay() {
		System.out.println("Payment done using UPI ");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Payment1 p = new UPIPayment();
		
		p.pay();
		
		Payment1 p1 = new CreditCardPayment();
		
		p1.pay();
	}
}
