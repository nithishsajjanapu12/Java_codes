package com.multithreading;

public class MultiThreadDemo3 {
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		Thread parent = new Thread(() -> {
			System.out.println("Parent Thread is Running ");

			Thread child = new Thread(() -> {

				System.out.println("Child Thread is Running ");
			});
			System.out.println("Child is Daemon ?" + child.isDaemon());
			child.start();
		});
		parent.setDaemon(true);
		parent.start();
	}
}
