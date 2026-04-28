package com.javapractice2;
//input : array = { 1, 2, 2, 3, 4, 4 ,5}
//output : 1 2 3 4 5
// even : 2 4
// odd  : 1 3 5
//prime : 2 3 5
public class FunDemo15 {

	public static void main(String[] args) {
		int arr[] = { 5, 1, 2, 4, 2, 3, 4, 4, 5};
		boolean rep[]=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(rep[i]) {
				continue;
			}
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					rep[j]=true;
				}
			} 
			
			System.out.println(arr[i]);
			
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i % 2 ==0) {
				System.out.println(arr[i]+" ");
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i % 2 !=0) {
				System.out.println(arr[i]+" ");
			}
		}
		for(int i=0;i<arr.length;i++) {
			boolean j[] = new boolean[arr.length]; 
			if()
		}
		        
	}
	
	

}
