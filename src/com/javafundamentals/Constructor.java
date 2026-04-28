
package com.javafundamentals;



public class Constructor {
    static int count=0;

    Constructor(){
    	count++;
    	System.out.println("Object called by no arg constructor");
    }

	public static void main(String[] args) {
		
		Constructor o1= new Constructor();
		
		System.out.println(count);
		Constructor o2=new Constructor();
		
		System.out.println(count);
		Constructor o3=new Constructor();
		
		System.out.println(count);
		
	}

}
