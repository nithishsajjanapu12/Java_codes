package com.javapractice1;

import com.javapractice.ConstructorDemo9;

public class CoreJavaDemo22 extends ConstructorDemo9{
	public CoreJavaDemo22() {
		super(); // ✅ allowed
		System.out.println("ChildClass object created");
	}

	public static void main(String[] args) {
		CoreJavaDemo22 cd = new CoreJavaDemo22();

	}

}

