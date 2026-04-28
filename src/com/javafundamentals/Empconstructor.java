package com.javafundamentals;

public class Empconstructor {
	int eid;
	String ename;
	double sal;
	Empconstructor(int eid,String ename,double sal){
		System.out.println("3 arg constructor called ");
		this.eid= eid;
		this.ename=ename;
		this.sal=sal;
		System.out.println();
		disp();
	}
	Empconstructor(int eid,String ename){
		System.out.println("2 arg constructor called ");
		this.eid= eid;
		this.ename=ename;
		this.sal=sal;
		System.out.println();
		disp();
		
	}
	Empconstructor(int eid){
		this.eid= eid;
		
		System.out.println(" 1 arg constructor called ");
		disp();
	}
	
	Empconstructor(){
		eid =2;
		ename = "Vijay";
		sal=40000;
		System.out.println(" no arg constructor called ");
		disp();
	}
	
	 void disp() {
		 System.out.println(eid);
			System.out.println(ename);
			System.out.println(sal);
			System.out.println();
			System.out.println("************************************");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empconstructor ec2= new Empconstructor(1,"Nithish",23000);
		Empconstructor ec= new Empconstructor(3,"Nithish");
		Empconstructor ec3 = new Empconstructor(4);
		Empconstructor ec1 = new Empconstructor();
	}

}
