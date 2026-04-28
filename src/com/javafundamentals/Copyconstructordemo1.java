package com.javafundamentals;

public class Copyconstructordemo1 {
	int empid;
	String empname;
	double empsalary;
	String empdept;
	
	public Copyconstructordemo1(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
//		System.out.println("*********************************");
		System.out.println("2 arg emp id, name constructor ");
		
	}
	public Copyconstructordemo1(Copyconstructordemo1 e1,double empsalary) {
		this.empid=e1.empid;
		this.empname=e1.empname;
		this.empsalary=empsalary;
//		System.out.println("**********************************");
		System.out.println("2 arg  emp object details, emp salary constructor");
		
	}
	public Copyconstructordemo1(Copyconstructordemo1 e1,String dept) {
		this.empid=e1.empid;
		this.empname=e1.empname;
		this.empsalary=e1.empsalary;
		this.empdept=empdept;
//		System.out.println("************************************");
		System.out.println("2 arg emp object details ,emp dept constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyconstructordemo1 cc = new Copyconstructordemo1(100,"Nithish");
		cc.show();
		System.out.println("***********************************************");
		Copyconstructordemo1 cc1 = new Copyconstructordemo1(cc,23000);
		cc1.show();
		System.out.println("***********************************************");
		Copyconstructordemo1 cc2 = new Copyconstructordemo1(cc,"CSE");
		cc1.show();
		System.out.println("***********************************************");
		
		
	}
	void show() {
		System.out.println("emp id : "+empid);
		System.out.println("emp name : "+empname);
		System.out.println("emp salary : "+empsalary);
		System.out.println("emp dept : "+empdept);
	}
}
