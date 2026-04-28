
package com.javafundamentals;

public class Copyconstructordemo3 {
	int empid;
	String name;
	double salary;
	static String CompanyName ="<----------Tech World---------->";
	static {
		System.out.println(CompanyName);
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
	}
	Copyconstructordemo3(int empid,String name,double salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		System.out.println("<-------------Parameterized constructor called !------------>");
	}
	Copyconstructordemo3(Copyconstructordemo3 cd3,double sal){
		System.out.println("<---------------Copyconstructor called !--------------->");
		this.empid=cd3.empid;
		this.name=cd3.name;
		this.salary=sal;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyconstructordemo3 cd3 = new Copyconstructordemo3(102,"Nikhil",250000.0);
		System.out.println();
		cd3.display();
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		Copyconstructordemo3 cd4 = new Copyconstructordemo3(cd3,56000.00);
		System.out.println();
		cd4.display();
		System.out.println();
		System.out.println("*************************************");
	}
	void display() {
		System.out.println("Employee id     : "+empid);
		System.out.println("Employee name   : "+name);
		System.out.println("Employee salary : "+salary);
	}
}
