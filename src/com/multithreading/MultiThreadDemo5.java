package com.multithreading;

public class MultiThreadDemo5 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);

			} catch (InterruptedException ie) {
				System.err.print(ie.getMessage());

			}
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MultiThreadDemo5 m4 = new MultiThreadDemo5();
		m4.start();
		for (int i = 0; i < 4; i++) {
			System.out.println("Main ");
		}
		try {
			m4.interrupt();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
