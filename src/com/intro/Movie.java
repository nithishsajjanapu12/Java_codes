package com.intro;

public class Movie {
	static int Accno=12345;
	String AccholderName;
	double balance;
	{   
		Accno++;
	}
	public static void main(String[] args) {
		Movie m=new Movie();
		System.out.println(m.AccholderName="Ram");
		System.out.println(	m.balance=322023);
		System.out.println(Accno);
		Movie m1=new Movie();		
		System.out.println(m1.AccholderName="Apple");
		System.out.println(	m1.balance=322023);
		System.out.println(Accno);
		Movie m2=new Movie();		
		System.out.println(m2.AccholderName="Apple");
		System.out.println(	m2.balance=322023);
		System.out.println(Accno);
        
	}
	
}
