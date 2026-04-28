package com.javastring;

import java.util.Scanner;

public class StringDemo9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s = "HelloJava";
		String s1 = "HelloWorld";
		String s2 = "HelloJavascript";
		String s3="Hello";
		char[] arr= {'j','a','v','a'};
		
		System.out.println(s.charAt(0)); //H   returns char for a character in a string
		
		System.out.println(s.codePointAt(0)); //72  Returns ASCII value for the character in a string
		
		System.out.println(s.codePointBefore(1)); //72   Returns ASCII value for before character of mentioned index in a string
		
		System.out.println(s.compareTo(s1)); //-13    Returns difference between ASCII value of first odd of an index in two string occured  number
		
		System.out.println(s.compareTo(s3)); //4   Returns between extra number of  character difference in the string when compared
		
		System.out.println(s.codePointCount(1,8)); //7  takes index and limit returns count of the string
		
		System.out.println(s.compareToIgnoreCase(s2)); // -6   returns character ASCII difference or count of number difference
		
		System.out.println(s.contains("Java"));//true
		
		System.out.println(s.contentEquals("HelloJava")); //true
		
		System.out.println(s.copyValueOf(arr)); //java
		
		System.out.println(s.copyValueOf(arr,1,1)); //a
		
		System.out.println(s.endsWith("Java")); //true
		
		System.out.println(s.equals(s1)); //false
		
		System.out.println(s.equalsIgnoreCase(s2)); //false
		
		System.out.println(s.getBytes()); //[B@6bc7c054
		
		System.out.println(s.hashCode()); //-1094607372
		
		System.out.println(s.indexOf('a'));//6
		
		System.out.println(s.indexOf('a',7));//8
		
		System.out.println(s1.indexOf("or"));//6
		
		System.out.println(s1.indexOf("or",5));//6
		
		System.out.println(s1.isEmpty());//false
		
		System.out.println(s1.intern()==s2);//false
		
		System.out.println(s.lastIndexOf('a'));//8
		
		System.out.println(s.lastIndexOf('a',7));//6
		
		System.out.println(s.lastIndexOf("Ja"));//5
		
		System.out.println(s.lastIndexOf("Ja",5));//5  
		
		System.out.println(s.toLowerCase()); //hellojava
		
		System.out.println(s.toUpperCase()); //HELLOJAVA
		
		System.out.println(s.length()); //9
		
		System.out.println(s.toString()); 
		
		String a = "23";
		
		System.out.println(a.toString()); //23
		
		System.out.println();
		
	}

}
