package com.practiceloop;

import java.util.Scanner;

public class PracticeLoopDemo18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        int i = 1;
        int count = 0;

        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }

        if (count == 2) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}