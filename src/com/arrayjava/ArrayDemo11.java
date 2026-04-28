package com.arrayjava;

public class ArrayDemo11 {
	    public static void main(String[] args) {

	        int arr[][] = {
	            {1, 1, 0},
	            {1, 1, 1},
	            {0, 1, 1}
	        };

	        int rows = arr.length;
	        int cols = arr[0].length;

	        int result[][] = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {

	                if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
	                    result[i][j] = 0;
	                } else {
	                    result[i][j] = arr[i][j];
	                }
	            }
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
// Input matrix
// Calculate row sums and column sums
// Find highest row sum
// Find highest column sum
// Output results
