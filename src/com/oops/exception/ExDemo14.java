package com.oops.exception;

import java.util.Scanner;

public class ExDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create an array of 5 elements
        int[] arr = {10, 20, 30, 40, 50};

        try {
            // Step 2: Ask the user to enter an index
            System.out.print("Enter an index (0-4): ");
            int index = sc.nextInt();

            // Step 3: Ask the user to enter a number in String format
            System.out.print("Enter a number (in String format): ");
            String input = sc.next();

            // Step 4: Convert the String into an integer
            int number = Integer.parseInt(input);

            // Step 5: Divide the array element at that index by the entered number
            int result = arr[index] / number;

            System.out.println("Result: " + result);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format! Please enter a valid integer.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } 
        finally {
            sc.close();
        }
    }
}