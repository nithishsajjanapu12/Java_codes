package com.javalooping;
import java.util.Scanner;

public class LoopDemo12 {

    public static void main(String[] args) {

        // Generate random number between 1 and 10
        int randomNumber = (int)(Math.random() * 10) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 10");
        System.out.println("You have 3 chances!");

        for (int chance = 1; chance <= 3; chance++) {

            System.out.print("Chance " + chance + " - Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct! You won in chance " + chance + ".");
                break;
            } else {
                if (chance < 3) {
                    System.out.println("Wrong guess! Chances left: " + (3 - chance));
                } else {
                    System.out.println("Game Over!");
                    System.out.println("The correct number was: " + randomNumber);
                }
            }
        }

        sc.close();
    }
}
