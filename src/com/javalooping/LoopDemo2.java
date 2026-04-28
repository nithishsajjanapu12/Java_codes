package com.javalooping;

import java.util.Scanner;

/*
 * An electricity board records the daily power consumption for 30 days.
 * The board wants to calculate the total consumption and average daily usage using a java program.
 * Using  loop:
 * - Read daily electricity units
 * - Calculate total units 
 * - Calculate average daily consumption
 * - Categorize usage Level
 */
public class LoopDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = 30;

		double TotalUnits = 0;

		// Input daily consumption for 30 days
		for (int i = 1; i <= days; i++) {
			System.out.print("\nPlease Enter " + "day " + i + " power consumption");

			double units = sc.nextDouble();
			TotalUnits = (TotalUnits + units);
			System.out.print("Total Consumed : " + TotalUnits);
		}

		// Calculate average daily consumption
		double average = TotalUnits / days;
		// Display total and average
		System.out.println("\nTotal Units Consumed = " + TotalUnits);
		System.out.println("\nAverage Daily Consumption = " + average);
		usageLevel(average);
		sc.close();
	}

	static void usageLevel(double average) {
		if (average < 5) {
			System.out.println("\nLow Usage of Power" + average);
		} else if (average < 10) {
			System.out.println("\nMedium Usage of Power" + average);
		} else if (average > 10) {
			System.out.println("\nHigh Usage of Power" + average);
		} else {
			System.out.println("\nPower Not Consumed");
		}
	}
}
