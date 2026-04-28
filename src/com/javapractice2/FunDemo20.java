package com.javapractice2;
class Student implements Cloneable {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

public class FunDemo20 {
    public static void main(String[] args) throws Exception {
        int[] marks = {80, 90, 70};

        Student s1 = new Student("Ravi", marks);

        Student s2 = (Student) s1.clone();

        // Modify cloned object
        s2.marks[0] = 100;

        System.out.println(s1.marks[0]); // 😮 100
        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
        System.out.println(s1.marks==s2.marks);
    }
}