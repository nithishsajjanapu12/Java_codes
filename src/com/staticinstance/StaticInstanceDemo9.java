package com.staticinstance;

public class StaticInstanceDemo9 {
	static int a = 10;
	int b = 20;

	static {
		a = a + 5;
	}

	{
		b = b + 10;
	}

	StaticInstanceDemo9() {
		a++;
		b++;
	}

	public static void main(String[] args) {
		StaticInstanceDemo9 t1 = new StaticInstanceDemo9();
		StaticInstanceDemo9 t2 = new StaticInstanceDemo9();

		System.out.println(t1.a + " " + t1.b);
		System.out.println(t2.a + " " + t2.b);
	}
}
