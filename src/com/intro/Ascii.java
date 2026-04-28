package com.intro;
import java.util.Scanner;
public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);       // here ch character accepts a character as a string at zeroth index
        System.out.println("You Entered : "+ch);
        int ascii_value = (int)ch;           //type casting from char to int in RHS side
        System.out.println("ASCII value:"+ascii_value);
        sc.close();
	}

}
