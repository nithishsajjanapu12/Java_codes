package com.javapractice;


public class AsciiNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i < 10) {
                // single digit
                char c = (char) ('0' + i);
                System.out.println(c);

            } else if (i < 100) {
                // two digits
                char tens = (char) ('0' + (i / 10));
                char ones = (char) ('0' + (i % 10));
                System.out.println("" + tens + ones);

            } else {
                // 100
                char one = '1';
                char zero1 = '0';
                char zero2 = '0';
                System.out.println("" + one + zero1 + zero2);
            }
        }
    }
}
