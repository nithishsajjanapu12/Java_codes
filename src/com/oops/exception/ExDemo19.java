package com.oops.exception;


class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address; // 👈 this is just a field that points to another object

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

public class ExDemo19 {
    public static void main(String[] args) throws Exception {
        Address addr = new Address("Hyderabad");
        Person p1 = new Person("Ravi", addr);

        Person p2 = (Person) p1.clone();
        p1.address.city ="Kolhapur";
        p2.address.city = "New York";

        System.out.println(p1.address.city); // Delhi ❗
        
        System.out.println(p2.address.city); // Delhi  !
        
        System.out.println(p1.name); //Ravi
        
        System.out.println(p2.name); //Ravi
        
        System.out.println(p1 == p2);//false
        
        System.out.println(p1.name == p2.name); //true
        
        System.out.println(p1.address == p2.address);//true
        
        System.out.println(p1);  //com.oops.exception.Person@7ad041f3
        
        
        System.out.println(p2);//com.oops.exception.Person@251a69d7
        
        
    }
}