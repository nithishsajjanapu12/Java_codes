package com.multithreading;

class Resource {
	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {
		while (status) {
			wait(); 	// waits the producer thread
		}
		this.i = i;
		System.out.println("PUT : " + i);
		status = true;
		notify(); 		// wakes consumer's wait()
	}

	synchronized void get() throws InterruptedException {
		while (!status) {
			wait(); 	// waits the consumer thread
		}
		System.out.println("GET : " + i);
		status = false;
		notify(); 		// wakes producer's wait()
	}
}

class Producer implements Runnable {
	Resource r;

	Producer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				r.put(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

class Consumer implements Runnable {
	Resource r;

	Consumer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				r.get();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class MultiThreadDemo6 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);

	}

}
