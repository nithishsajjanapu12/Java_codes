package com.javaarray;
public class DemoArray3 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5}; // Original array

        System.out.print("Original array: ");
        printArray(arr);

        int nextNonZeroIndex = 0; // Position to place the next non-zero number

        // Step 1: Move all non-zero numbers to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nextNonZeroIndex] = arr[i];
                nextNonZeroIndex++;
            }
        }

        // Step 2: Fill the remaining positions with 0
        while (nextNonZeroIndex < arr.length) {
            arr[nextNonZeroIndex] = 0;
            nextNonZeroIndex++;
        }

        System.out.print("Array after moving zeros to end: ");
        printArray(arr);
    }

    // Method to print the array
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
