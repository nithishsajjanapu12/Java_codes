package com.intro;

public class ObjectCount {
	protected void finalize() {
		System.out.println("Garbage Collected");
	}
    static int count=0;
//    {
//    	count++;
//    }
    ObjectCount(){
    	count++;
    	System.out.println("");
    }
//    void object_count() {
//    	System.out.println("Object counted");
//    }
	public static void main(String[] args) {
		
		ObjectCount o1= new ObjectCount();
		
		System.out.println(count);
		ObjectCount o2=new ObjectCount();
		
		System.out.println(count);
		ObjectCount o3=new ObjectCount();
		
		System.out.println(count);
		System.gc();
	}

}
