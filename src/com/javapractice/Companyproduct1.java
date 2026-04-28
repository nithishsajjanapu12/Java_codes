package com.javapractice;

public class Companyproduct1 {

    int id;
    String name;
    double price;

    // Default constructor
    public Companyproduct1() {
        this(0, "Unknown", 0.0);
    }

    // Constructor with id and name only
    public Companyproduct1(int id, String name) {
        this(id, name, 100.0);
    }

    // Constructor with all values
    public Companyproduct1(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Company product id    : " + id);
        System.out.println("Company product name  : " + name);
        System.out.println("Company product price : " + price);
    }

    public static void main(String[] args) {
        Companyproduct1 p1 = new Companyproduct1();
        p1.display();

        System.out.println("********************");

        Companyproduct1 p2 = new Companyproduct1(101, "Pen");
        p2.display();

        System.out.println("********************");

        Companyproduct1 p3 = new Companyproduct1(102, "Book", 250.0);
        p3.display();
    }
}

