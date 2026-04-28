
63package com.javapractice1;

class CoreJavaDemo950 {

    int id;

    // Parameterized constructor of parent class
    CoreJavaDemo950(int id) {
        this.id = id;
        System.out.println("Parent class constructor called, ID = " + id);
    }
}

public class CoreJavaDemo18 extends CoreJavaDemo950 {

    // Constructor of child class
    CoreJavaDemo18() {
        super(100);  // Calls parent class parameterized constructor
        System.out.println("Child class constructor called");
    }

    public static void main(String[] args) {
        CoreJavaDemo18 c1 = new CoreJavaDemo18();
    }
}
