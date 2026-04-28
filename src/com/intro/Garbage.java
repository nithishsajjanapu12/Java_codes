package com.intro;

public class Garbage {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is being garbage collected");
		
	}

	public static void main(String[] args) {
	Garbage g1=new Garbage();
	System.out.println(g1);
	g1=null;
	System.out.println(g1);
	System.out.println("null reference object cleared by GC");
	
	Garbage g2=new Garbage();
	System.out.println(g2);
	Garbage g3= new Garbage();
	System.out.println(g3);
	g2=g3;
	System.out.println(g2+"  is replaced with object address "+g3);
	System.out.println("reassigning object is removed by GC");
	
	new Garbage();
	display();
	
	
	
	System.out.println("anonymous object is removed by GC");
	
	System.out.println("Requesting Garbage collection...");
	System.gc();
	}
	static void display() {
		Garbage g5=new Garbage();
		System.out.println(g5);
		System.out.println("used object is  object is removed by GC");
	}

}
