package com.javalooping;
import java.util.Scanner;

public class LoopDemo18 {

	    public static boolean isPrime(int n) {
	        if (n < 2) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a big integer: ");
	        String num = sc.next();   
	        for (int i = 0; i <= num.length() - 3; i++) {
	            String part = num.substring(i, i + 3);
	            int value = Integer.parseInt(part);

	            if (isPrime(value)) {
	                System.out.println(value + " is Prime");
	            } else {
	                System.out.println(value + " is Not Prime");
	            }
	        }

	        sc.close();
	    }
	}
