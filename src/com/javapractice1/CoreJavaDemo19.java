package com.javapractice1;

//Write a program using a private constructor and explain its use.
class CoreJavaDemo19 {
	// private constructor
	private CoreJavaDemo19() {
		System.out.println("Object created ");
	}

	// static method to create object
	public static CoreJavaDemo19 createObject() {
		return new CoreJavaDemo19();
	}

}

class Main1 {
	public static void main(String[] args) {
		// Object cannot be created using 'new'
//		CoreJavaDemo19 cd = new CoreJavaDemo19();

		// Object is created using method

		CoreJavaDemo19 cd = CoreJavaDemo19.createObject();
	}
}
