package com.javaarray;


public class DemoArray5 {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] result = new int[3][3];

        result[0][0] = arr[0][0] * arr[0][0] + 8;
        result[0][1] = arr[0][1];                
        result[0][2] = arr[0][2] - 2;           

        result[1][0] = arr[1][0] * 2;           
        result[1][1] = arr[1][1] * arr[1][1];   
        result[1][2] = arr[1][2] * 2;            

        result[2][0] = arr[2][0] + 2;           
        result[2][1] = arr[2][1];                
        result[2][2] = arr[2][2] * arr[2][2] - 32; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
