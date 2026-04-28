package com.javapractice;

public class  Singleton {
	private static Singleton obj;

    // Private constructor
    private Singleton() {
        System.out.println("Private constructor called");
    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
	}

}
//class {
//
//    private static Singleton obj;
//
//    // Private constructor
//    private Singleton() {
//        System.out.println("Private constructor called");
//    }
//
//    public static Singleton getInstance() {
//        if (obj == null) {
//            obj = new Singleton();
//        }
//        return obj;
//    }
//
//    public static void main(String[] args) {
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//    }
//}
