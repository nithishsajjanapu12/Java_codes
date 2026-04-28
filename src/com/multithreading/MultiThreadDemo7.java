package com.multithreading;
class MyThreadClass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		
	}
}
public class MultiThreadDemo7 {
	public static void main(String [] args) {
		System.out.println(Thread.currentThread());
		MyThreadClass t2= new MyThreadClass();
		MyThreadClass t3 = new MyThreadClass();
		t2.start();
		t3.start();
	}

}