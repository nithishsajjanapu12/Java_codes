package com.javapractice2;
//Difference between == and .equals() for String
public class FunDemo7 {

	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Hi";
		
		String s3 = new String("RAMA");
		System.out.println(s3);
		
		System.out.println(s1==s2); //Checks whether both variables point to the same object in the memory 
									//Doesn't compare the actual text
		System.out.println(s1.equals(s2)); //Checks whether  the text (value ) is the same
										   //This is what you usually want for strings
		
		String a = new String("Hello");
		String b = new String("Hello");

		System.out.println(a == b); //false because Even though the content is the same, they are different objects
		
		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s1 == s2);        // false
		System.out.println(s1.equals(s2));   // true

	}

}
