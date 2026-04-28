package com.javalooping;

import java.util.Scanner;

public class LoopDemo14 {
	int id =101;
	String name = "Nithish";
	int marks =93;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoopDemo14 lp= new LoopDemo14();
		lp.method2();
	}

	public  void method2() {
		System.out.println(id+" "+name+" "+marks);
	}

	public void method1(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
