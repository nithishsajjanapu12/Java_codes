package com.javalooping;
import java.util.Scanner;
public class LoopDemo17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int temp = n;
        int digitCount = 0;

        // Count digits
        while (temp != 0) {
            digitCount++;
            temp = temp / 10;
        }

        System.out.println("Count of digits : " + digitCount);

        temp = n;   // reset temp
        int sum = 0;

        // Calculate Armstrong sum
        while (temp != 0) {

            int digit = temp % 10;

            // Calculate digit^digitCount manually
            int power = 1;
            for (int i = 1; i <= digitCount; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        System.out.println("Sum : " + sum);

        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }

        sc.close();
	}

}
