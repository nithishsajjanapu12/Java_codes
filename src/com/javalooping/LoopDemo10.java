package com.javalooping;

import java.util.Scanner;

// Print the Fibonacci series using for loop
public class LoopDemo10 {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < n; i++) {
            int n3 = n1 + n2;
            
            System.out.print(" " + n3);
            
            n1 = n2;
            n2 = n3;
        }

        sc.close();
    }
}
