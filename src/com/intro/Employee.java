package com.intro;

public class Employee {
	int empid = 6830;
	String empname ="Nithish";
	int salary = 20000;
	
	
    {
    	double percentage = 0.1;
    	double Bonus = (percentage * salary);
        double originalsalary = (Bonus + salary);
        System.out.println("Salary with Bonus"+originalsalary);
        System.out.println("Employee id : "+empid);
        System.out.println("Employee name : "+empname);
        System.out.println("Employee original salary : "+salary);
        
    }
	public static void main(String[] args) {
        
	}

}
