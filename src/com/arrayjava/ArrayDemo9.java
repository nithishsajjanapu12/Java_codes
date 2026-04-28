package com.arrayjava;

import java.util.Scanner;

//*Batch-No* 68:- *Assignment*
//
//*Java:-*
//
//1.Rotate the array left by 1 position
//
//Input:  10, 20, 30, 40, 50
//Output: 20 30 40 50 10
//
//
//*SQL*:
//
//1.List the emps name ,dept, sal and comm. For those whose salary is between 2000
//
//and 5000 while loc is Chicago.

public class ArrayDemo9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        // store first element
        int first = arr[0];

        // shift elements to the left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // move first element to last
        arr[n - 1] = first;

        // print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
