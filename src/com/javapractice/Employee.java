package com.javapractice;

public class Employee {
	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Employee(Employee e){
		this.id=e.id;
		this.name=e.name;
		//this(e.id,e.name);
	}
	void show() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee(101,"Sheethal");
		Employee e2 = new Employee(e1);
		e2.name="Riya";
		e1.show();
		e2.show();
		
	}

}
