package com.games;

import java.util.Objects;

public class Test {
	
	String s2;

	public Test(String s) {
		this.s2=s;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(s2);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return Objects.equals(s2, other.s2);
	}



	public static void main(String[] args) {
		 String s="madhan" ;
		 String S1=new String("madhan");
		Test t1=new Test(s);
		Test t2=new Test(S1);
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));

	}

}
