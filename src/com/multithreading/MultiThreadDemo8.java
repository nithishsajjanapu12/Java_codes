package com.multithreading;
class MyThreading extends Thread{
	String s;
	MyThreading(String s){
		this.s=s;
	}
    public void run() {
    	System.out.println("String value is : "+s);
    }
}
public class MultiThreadDemo8 {
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		MyThreading m= new MyThreading("HI");
		MyThreading  m3 = new MyThreading("Hello");
		m.start();
		m3.start();
	}

}
