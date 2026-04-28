package com.arrayjava;
import java.util.Scanner;

public class ArrayDemo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] rowSum = new int[3];
        int[] colSum = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }

        int maxRowSum = rowSum[0];
        int maxRowIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (rowSum[i] > maxRowSum) {
                maxRowSum = rowSum[i];
                maxRowIndex = i;
            }
        }

        int maxColSum = colSum[0];
        int maxColIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (colSum[i] > maxColSum) {
                maxColSum = colSum[i];
                maxColIndex = i;
            }
        }

        System.out.println("\nRow sums:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + (i + 1) + " sum = " + rowSum[i]);
        }

        System.out.println("\nColumn sums:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Column " + (i + 1) + " sum = " + colSum[i]);
        }

        System.out.println("\nHighest row sum = " + maxRowSum +
                " (Row " + (maxRowIndex + 1) + ")");

        System.out.println("Highest column sum = " + maxColSum +
                " (Column " + (maxColIndex + 1) + ")");

        sc.close();
    }
}
