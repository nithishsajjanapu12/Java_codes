package com.intro;
import java.util.Scanner;


public class Garbage1 {
    int n,m;                             //instance variables
    int add(int a,int b) {                     //instance return method
    	System.out.println("return addition: ");
    	return a+b;
    }
    int sub(int c,int d) {                     //instance return method
    	System.out.println("return substraction : ");
    	return c-d;
    }
    void mul(int e, int f) {                   //instance void method
    	System.out.println("print multiplication : "+(e * f));
    	
    }
    void div(int g, int h) {                   //instance void method
    	System.out.println("print division : "+(g /h));
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();                            //Takes a input 'n'
        System.out.println("Enter n : "+n);
        int m= sc.nextInt();                            //Takes a input 'm'
        System.out.println("Enter m : "+m);
        
        Garbage1 g1= new Garbage1();
        System.out.println(g1.add(n, m));         //if an instance returns then it must print only in main using SOP
        System.out.println(g1.sub(n, m));
        g1.mul(n, m);                             //if an instance void then it doesnt return its value to main() method so it prints in instance method itself
        g1.div(n, m);
        
        sc.close();                               //scanner close
	}

}
