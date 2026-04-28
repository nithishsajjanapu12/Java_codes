package com.multithreading;
class Counter{
	int count=0;
}
public class MultiThreadDemo9 {

	public static void main(String[] args) throws InterruptedException{
		Counter c = new Counter();
		System.out.println("MAin method");
		Thread t1  = new Thread(()->{
			for(int i=0;i<1000;i++)
				c.count++;
		});
		
		t1.start();
		
		t1.join(); //wait for counting
		
		System.out.println(c.count); //correct result
	}

}
