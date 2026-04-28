package com.intro;

public class InstanceStaticDemo2 {
	// instance varaibles
	private String name;
	private double salary;
	private int employeeId;

	// static variables
	static String companyName = "Tech Mahindra";
	static int employeeCount = 0;

	// constructor
	InstanceStaticDemo2(String name, double salary, int employeeId) {
		this.name = name;
		this.salary = salary;
		employeeCount++; // Increment employee count
		this.employeeId = employeeCount;// Auto generate employee ID

	}

	// display employee details
	public void displayEmployeeDetails() {
		System.out.println("Name : " + name);
		System.out.println("salary : " + salary);
		System.out.println("employeeId : " + employeeId);
		System.out.println("--------------------------------------------");
	}

	//
	public static void changeCompanyName(String newName) {
		companyName = newName;
	}

	public static void main(String[] args) {
		InstanceStaticDemo2 sd = new InstanceStaticDemo2("Nithish", 23000.00, 2123133);
		InstanceStaticDemo2 sd1 = new InstanceStaticDemo2("Kiran", 12200.00, 23413411);
		InstanceStaticDemo2 sd2 = new InstanceStaticDemo2("Ramcharan", 20000.00, 23435235);
		sd.displayEmployeeDetails();
		sd1.displayEmployeeDetails();
		sd2.displayEmployeeDetails();
	}

}

class Employ {
	public static void main(String[] args) {
		InstanceStaticDemo2 id = new InstanceStaticDemo2("Kumar", 12900.00, 2300023);
		id.displayEmployeeDetails();
	}
}
