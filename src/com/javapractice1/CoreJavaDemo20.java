package com.javapractice1;

class CoreJavaDemo20 {
	private CoreJavaDemo20() {
		System.out.println("Object created ");
	}

	public static CoreJavaDemo20 objectCreation() {
		return new CoreJavaDemo20();
	}
}

class Main {
	public static void main(String[] args) {
		CoreJavaDemo20 cd = CoreJavaDemo20.objectCreation();
	}
}
