package com.javaarray;
//even and odd count in array
public class DemoArray11 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int arr[] = { 23, 35, 6, 54, 1, 9, 4 };
		
		int evenCount=0;
		int oddCount=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else if(arr[i]%2!=0){
				oddCount++;
			}
		}
		System.out.println("evenCount is : "+evenCount);
		System.out.println("OddCount is : "+oddCount);
	}

}
