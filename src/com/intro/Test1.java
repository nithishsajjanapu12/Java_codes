package com.intro;

public class Test1 {
	static int count=123;
	{
		count++;
	}
	void objectcounted() {
		System.out.println("Object counted");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.objectcounted();
		System.out.println("Object Count:"+count);
		Test1 t1=new Test1();
		t1.objectcounted();
		System.out.println("Object Count:"+count);
		Test1 t2=new Test1();
		t2.objectcounted();
		System.out.println("Object Count:"+count);
		Test1 t3=new Test1();
		t3.objectcounted();
	System.out.println("Object Count:"+count);
	System.gc();
	}

}
