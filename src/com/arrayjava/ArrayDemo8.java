package com.arrayjava;
//input = {23,15,12,78}
//output = {12,23,15,78}
public class ArrayDemo8 {
	
	public static void main(String[] args) {
		int arr[] = {23,15,12,78};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int ld1=arr[i]%10;
				int ld2=arr[j]%10;
				
				if(ld2<ld1) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

}
