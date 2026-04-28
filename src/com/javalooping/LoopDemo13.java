package com.javalooping;
import java.util.Scanner;

public class LoopDemo13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        long result = 0;

     // Step 1: Extract digits ignoring zeros
        while (num != 0) {
            long digit = num % 10; // get last digit
            if (digit != 0) {    	   // ignore zeros
                result = result * 10 + digit;
            }
            num = num / 10;         // remove last digit
        }

        System.out.println("Output (non-zero digits in reverse): " + result);

      // Step 2: Reverse the output
        long reversed = 0;
        while (result != 0) {
            long digit = result % 10;
            reversed = reversed * 10 + digit;
            result = result / 10;
        }

        System.out.println("Reversed Output: " + reversed);

        sc.close();
    }
}
