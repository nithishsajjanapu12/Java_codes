package com.multithreading;

public class MultiThreadDemo2 extends Thread {
	int a;

	MultiThreadDemo2(int a) {
		this.a = a;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + (i * a));
		}
	}

	public static void main(String[] args) {

		MultiThreadDemo2 m2 = new MultiThreadDemo2(2);
		MultiThreadDemo2 m3 = new MultiThreadDemo2(3);
		MultiThreadDemo2 m4 = new MultiThreadDemo2(5);

		m2.start();
		m3.start();
		m4.start();
	}

}
