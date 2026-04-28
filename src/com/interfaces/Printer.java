package com.interfaces;

abstract class BasicDevice implements Device{
	public static void main(String[] args) {
		
	}
	public void start() {
		System.out.println("Device started");
	}
	public void stop() {
		System.out.println("Device stopped");
	}
}
class Printer extends BasicDevice{

	public static void main(String[] args) {
		
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

}
