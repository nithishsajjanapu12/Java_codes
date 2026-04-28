package com.oops.exception;

import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ExDemo18 {

    static void validUserName(String userName) throws InvalidUsernameException {
        if (userName == null || userName.length() < 5) {
            throw new InvalidUsernameException("Username must be at least 5 characters long.");
        }
    }

    static void validPassword(String password) throws InvalidPasswordException {
        if (password == null || password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }
    }

    static void validNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the Username: ");
            String userName = sc.nextLine();
            validUserName(userName);

            System.out.print("Enter the Password: ");
            String password = sc.nextLine();
            validPassword(password);

            System.out.print("Enter a positive number: ");
            int number = sc.nextInt();
            validNumber(number);

            System.out.println("\nAll inputs are valid! Program completed successfully.");

        } catch (InvalidUsernameException ue) {
            System.err.println("Username Error: " + ue.getMessage());
        } catch (InvalidPasswordException pe) {
            System.err.println("Password Error: " + pe.getMessage());
        } catch (NegativeNumberException ne) {
            System.err.println("Number Error: " + ne.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}