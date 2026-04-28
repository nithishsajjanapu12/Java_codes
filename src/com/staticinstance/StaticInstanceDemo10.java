package com.staticinstance;
//Access Instance from static 
public class StaticInstanceDemo10 {
	int x = 10;
	
	static void show() {
		StaticInstanceDemo10 sd = new StaticInstanceDemo10();
		System.out.println(sd.x);
	}
	public static void main(String[] args) {
		
	}

}
