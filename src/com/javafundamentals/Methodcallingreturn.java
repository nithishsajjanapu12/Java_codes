package com.javafundamentals;
import java.util.Scanner;

public class Methodcallingreturn {

    // 1st static method: performs addition
    static int method1(int a, int b) {
        return a + b;
    }

    // 2nd static method: performs subtraction
    static int method2(int k, int l) {
        return k - l;
    }

    // 3rd static method: performs multiplication
    static int method3(int m, int n) {
        return m * n;
    }

    // 4th static method: performs division
    static double method4(int g, int h) {
        return (double) g / h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs for first static method
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Call method1 → addition
        int p = method1(a, b);
        System.out.println("Output of Method 1 (Addition): " + p);

        // Input for method2 → subtraction
        System.out.print("Enter number for subtraction: ");
        int sub = sc.nextInt();

        int q = method2(p, sub);
        System.out.println("Output of Method 2 (Subtraction): " + q);

        // Input for method3 → multiplication
        System.out.print("Enter number for multiplication: ");
        int mul = sc.nextInt();

        int r = method3(q, mul);
        System.out.println("Output of Method 3 (Multiplication): " + r);

        // Input for method4 → division
        System.out.print("Enter number for division: ");
        int div = sc.nextInt();

        double s = method4(r, div);
        System.out.println("Output of Method 4 (Division): " + s);

        sc.close();
    }
}
