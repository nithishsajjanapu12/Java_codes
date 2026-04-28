package com.arrayjava;
import java.util.Scanner;

public class ArrayDemo10 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        System.out.println(" \nArray:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nTarget Sum: " + target);
        System.out.println("Pairs:");

        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found.");
        }

        sc.close();
    }
}
