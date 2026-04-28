package com.javafundamentals;

class Address1 {
    String city;

    Address1(String city) {
        this.city = city;
    }
}
class Employee {
    int id;
    Address1 address;

    Employee(int id, Address1 address) {
        this.id = id;
        this.address = address;
    }

    // Shallow copy constructor
    Employee(Employee e) {
        this.id = e.id;               // copied value
        this.address = e.address;     // copied reference (IMPORTANT)
    }
}
public class ShallowCopyDebugDemo {
    public static void main(String[] args) {

        Address1 addr = new Address1("Delhi");
        Employee emp1 = new Employee(101, addr);

        // Shallow copy
        Employee emp2 = new Employee(emp1);

        // Modify address using emp2
        emp2.address.city = "Mumbai";

        System.out.println(emp1.address.city);
        System.out.println(emp2.address.city);
    }
}
