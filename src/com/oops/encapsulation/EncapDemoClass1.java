package com.oops.encapsulation;

public class EncapDemoClass1 extends EncapDemo1{

	public static void main(String[] args) {
		EncapDemo1 e1 = new EncapDemo1();
		e1.setSid(30);
		e1.setName("Nithish");
		e1.setAge(23);
		
		System.out.println(e1.getSid());
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		
	}

}
