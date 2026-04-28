package com.javastring;

public class StringDemo2 {

    public static void main(String[] args) {
    	System.out.println("Main Method Started");
        String s = "Nithish";
         int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
           
            
            if (s.indexOf(c) != i) {
                continue;
            }
            
            for (int j = 0; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println("Count of '" + c + "' is: " + count);
        }
        
        System.out.println("Main Method ended ");
    }
}
