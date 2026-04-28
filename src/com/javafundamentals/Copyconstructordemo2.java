package com.javafundamentals;

public class Copyconstructordemo2{
	int sid;
	String sname;
	String branch;
	public Copyconstructordemo2(int sid, String sname, String branch) {
		System.out.println();
		System.out.println("<--------- 3 arg constructor called ---------->");
		System.out.println();
		this.sid=sid;
		this.sname=sname;
		this.branch=branch;
		
	}
	public Copyconstructordemo2(Copyconstructordemo2 cd2) {
		System.out.println("<----------- copyconstructor called ----------->");
		this.sid=cd2.sid+17;
		this.sname="Nithish";
		this.branch=cd2.branch;
		
	}
	public static void main(String [] args) {
		Copyconstructordemo2 cd2 = new Copyconstructordemo2(13,"Vijay","CSE");
		System.out.println();
		cd2.display();
		System.out.println();
		System.out.println("***********************************");
		Copyconstructordemo2 cd3 = new Copyconstructordemo2(cd2);
		System.out.println();
		cd3.display();
		System.out.println();
		System.out.println("************************************");
	}
	void display() {
		System.out.println("Student id     : "+sid);
		System.out.println("Student name   : "+sname);
		System.out.println("Student branch : "+branch);
	}
}