package com.javalooping;

public class LoopDemo11 {
	public static void main(String[] args) {

		int money = 30;
		int costPerChocolate = 5;
		int wrappersNeeded = 3;

		int chocolates = money / costPerChocolate;
		int totalEaten = chocolates;
		int wrappers = chocolates;

		while (wrappers >= wrappersNeeded) {

			int freeChocolates = wrappers / wrappersNeeded;
			totalEaten += freeChocolates;

			wrappers = (wrappers % wrappersNeeded) + freeChocolates;
		}

		System.out.println("Total chocolates eaten: " + totalEaten);
		System.out.println("Wrappers remaining: " + wrappers);
	}
}
