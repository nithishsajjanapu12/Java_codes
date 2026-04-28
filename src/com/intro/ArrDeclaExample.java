package com.intro;
import java.util.Scanner;
//ways to declare arrays 
public class ArrDeclaExample {

	public static void main(String args[]) {
		System.out.println("Main method started");
		args = new String[10];
		
		String str[];
		args[0]=" 'hi' from args[0]";
		args[1]=" 'hello' from args[1]";
		args[2]=" 'How' from args[2]";
		args[3]=" 'Are' from args[3]";
		args[4]=" 'You' from args[4]";
		args[5]=" 'Nithish' from args[5]";
		
//Below values are the values declared using new keyword or String type creation
		System.out.println("Below values are the  values declared using new keyword or String type creation");
		System.out.println();
		
		for(int i=0;i< args.length;i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("*******************************");
		System.out.println();
//Below values are declared using array representation by declaring variable as String
		System.out.println("Below values are declared using array representation by declaring variable as String");
		
		String[] array= {"Ram","Sita","Laxman"};
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		System.out.println("********************************");
		System.out.println();
//Below values are declared by using scanner class and new keyword for  creating string type array		
		System.out.println("Below values are declared by using scanner class and new keyword for creating string type array");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		String[] words = new String[n];
		for(int i =0;i<n;i++) {
			System.out.println("Enter String : "+(i+1) + ": ");
			words[i]= sc.nextLine();
			
		}
		System.out.println(words[n]);
		System.out.println();
		System.out.println();
		System.out.println("********************************");
//Below are the values declared by using scanner and array declaration
		System.out.println("Below values are declared by using scanner and array declaration");
		System.out.println();
		
		int m= sc.nextInt();
		sc.nextLine();
		String str1[] = null;
		for(int k =0 ;k < str1[m].length();k++) {
			System.out.println("Enter String : "+(k+1) + ": ");
			str1[k]=sc.nextLine();
			System.out.println(words[k]);
		}
		
		System.out.println();
		System.out.println("Main method ended");
	    sc.close();	
	}
}
