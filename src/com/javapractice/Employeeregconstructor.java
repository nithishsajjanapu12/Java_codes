package com.javapractice;

public class Employeeregconstructor {
	int eid;
	String ename;
	int eage;
	Employeeregconstructor(){
		eid = 0;
		ename = null;
		eage = 0;
		System.out.println(" no arg constructor called !");
		
		this(102,"Nithish",21);
	}
	Employeeregconstructor(int eid,String ename,int eage){
		this.eid=eid;
		this.ename=ename;
		this.eage=eage;
		System.out.println("3 arg parameterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeeregconstructor er = new Employeeregconstructor();
		er.display();
	}
	void display(){
		System.out.println("Employee Id : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee age : "+eage);
	}
}
