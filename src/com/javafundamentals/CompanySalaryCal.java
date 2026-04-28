package com.javafundamentals;
import java.util.Scanner;
//A company maintains a Salary Calculation System for its employees.
//The system performs various arithmetic operations to calculate salaries, bonuses, and deductions.
//1️⃣ Calculate the gross salary : 
//   grossSalary = basicSalary + bonus
//
//2️⃣ Calculate the net salary:
//netSalary = grossSalary - deduction
//
//3️⃣ Calculate the per-day salary:
//perDaySalary = basicSalary / totalWorkingDays
//
//4️⃣ Calculate the salary for days worked:
//earnedSalary = perDaySalary * daysWorked
//
//5️⃣ Find the remaining leave days using modulus:
//remainingDays = totalWorkingDays % daysWorked
public class CompanySalaryCal {
	static double basicSalary = 25000.0;
	static double bonus = 5000.0;
	static double deduction = 2000.0;
	int totalWorkingDays;
	int daysWorked;
public double grossSalary(double basicSalary,double bonus) {
	double grossSalary = basicSalary + bonus;
	System.out.println(grossSalary);
	return grossSalary;
}
public double netSalary(double grossSalary,double deduction) {
	double netSalary = grossSalary - deduction;
	System.out.println("Net salary : "+netSalary);
	return netSalary;
}
public double  perDaySalary(double basicSalary,int totalWorkingDays) {
	double  perDaySalary = basicSalary / totalWorkingDays;
	System.out.println("perDay Salary : "+perDaySalary);
	return perDaySalary;
}
public void earnedSalary(double perDaySalary,int daysWorked) {
	double earnedSalary = perDaySalary * daysWorked;
	System.out.println(" Earned Salary : "+earnedSalary);
}
public void remainingDays(int totalWorkingDays, int daysWorked) {
	int remainingDays = totalWorkingDays % daysWorked;
	System.out.println("Remaining Days : "+remainingDays);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	CompanySalaryCal cs = new CompanySalaryCal();
	System.out.println("Enter totalWorking Days : ");
	int totalWorkingDays=sc.nextInt();
	System.out.println("Enter daysWorked : ");
	int daysWorked = sc.nextInt();
	System.out.println();
	System.out.println("Gross Salary : "+cs.grossSalary(CompanySalaryCal.basicSalary,CompanySalaryCal.bonus));
	System.out.println();
	System.out.println("Net Salary : ");
	
	System.out.println();
	cs.grossSalary(bonus, basicSalary);
	sc.close();
}
}
