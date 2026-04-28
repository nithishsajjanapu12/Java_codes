package com.arrayjava;

public class ArrayDemo14 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 11, 5, 6, 1};
        int n = arr.length;
        int mid = n / 2;

        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[n - mid - 1];

        for (int i = 0; i < mid; i++) {
            firstHalf[i] = arr[i];
        }
        for (int i = 0; i < n - mid - 1; i++) {
            secondHalf[i] = arr[mid + 1 + i];
        }

        for (int i = 0; i < firstHalf.length - 1; i++) {
            for (int j = i + 1; j < firstHalf.length; j++) {
                if (firstHalf[i] < firstHalf[j]) {
                    int temp = firstHalf[i];
                    firstHalf[i] = firstHalf[j];
                    firstHalf[j] = temp;
                }
            }
        }

        for (int i = 0; i < secondHalf.length - 1; i++) {
            for (int j = i + 1; j < secondHalf.length; j++) {
                if (secondHalf[i] > secondHalf[j]) {
                    int temp = secondHalf[i];
                    secondHalf[i] = secondHalf[j];
                    secondHalf[j] = temp;
                }
            }
        }


        for (int i = 0; i < mid; i++) {
            arr[i] = firstHalf[i];
        }

        // arr[mid] = arr[mid]; 
        for (int i = 0; i < secondHalf.length; i++) {
            arr[mid + 1 + i] = secondHalf[i];
        }

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
