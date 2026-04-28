package com.arrayjava;
public class ArrayDemo21 {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        int x = arr[n - 1];
        System.out.print(x+" ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > x) {
                x = arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
}