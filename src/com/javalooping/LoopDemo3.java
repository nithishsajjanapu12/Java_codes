package com.javalooping;

import java.util.Scanner;

public class LoopDemo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
