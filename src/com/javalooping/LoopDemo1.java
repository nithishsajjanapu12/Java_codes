package com.javalooping;

import java.util.Scanner;

public class LoopDemo1 {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			fact = fact * i;
		}
		System.out.println(fact);
		sc.close();
		}

}
