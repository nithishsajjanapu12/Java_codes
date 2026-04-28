package com.javapractice2;

public class FunDemo17 extends FunDemo {
	FunDemo17() {
		// super();
		System.out.println("child no arg");
	}

	FunDemo17(int id) {
		// super();
		this();
		this.id = id;
		System.out.println("child 1 arg");
	}

	FunDemo17(int id, String name) {
		// super();
		this(102);
		this.id = id;
		this.name = name;
		System.out.println("child 2 arg");
	}

	public static void main(String[] args) {
		FunDemo17 fd = new FunDemo17(0, "Unknown");
		fd.display();
	}

	void display() {
		System.out.println("child id : " + id);
		System.out.println("child name : " + name);
	}
}

class FunDemo {
	int id;
	String name;

	FunDemo() {
		this(101);
		System.out.println("parent no arg");
	}

	FunDemo(int id) {
		this(102, "karim");
		this.id = id;
		System.out.println("parent 1 arg");
	}

	FunDemo(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("parent 2 arg");

	}

//	public static void main(String[] args) {
//		FunDemo fd1 = new FunDemo(104, "kumar");
//		fd1.display();
//	}

//	void display() {
//		System.out.println("parent id : " + id);
//		System.out.println("parent name : " + name);
//	}
}
