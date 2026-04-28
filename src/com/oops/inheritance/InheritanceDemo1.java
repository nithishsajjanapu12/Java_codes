package com.oops.inheritance;

class InheritanceDemo1 {
	void show() {
		System.out.println("A");
	}
}

class B99 extends InheritanceDemo1 {

	void show() {
		System.out.println("B");
	}

}

class Test {
	public static void main(String[] args) {
		InheritanceDemo1 obj = new B99();
		obj.show();
	}
}
