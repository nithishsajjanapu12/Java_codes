package com.arrayjava;


import java.util.Arrays;

public class ArrayDemo13 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 11, 5, 6, 1};

        int mid = arr.length / 2;

        int[] firstHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] secondHalf = Arrays.copyOfRange(arr, mid + 1, arr.length);

        Arrays.sort(firstHalf);
        reverseArray(firstHalf);

        Arrays.sort(secondHalf);

        for (int i = 0; i < mid; i++) {
            arr[i] = firstHalf[i];
        }
        arr[mid] = arr[mid];
        for (int i = 0; i < secondHalf.length; i++) {
            arr[mid + 1 + i] = secondHalf[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

