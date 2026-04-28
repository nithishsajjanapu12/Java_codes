package com.multithreading;

public class MultiThreadDemo1 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println("Hello Thread 1");
		for(int i=1;i<=30;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		MultiThreadDemo1 md = new MultiThreadDemo1();
		Thread obj = new Thread(md);
		obj.start();
		System.out.println(Thread.currentThread());
		
		Multi100 m = new Multi100();
		Thread t1 = new Thread(m);
		t1.start();
	}
}
class Multi100 extends MultiThreadDemo1{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println("Hello Thread 2");
	}
	
}
