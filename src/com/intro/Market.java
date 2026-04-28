package com.intro;
import java.util.Scanner;
public class Market {
	static int chocolate=15;                           //static variable
	static int cookies=10;                             //static variable
	int Moneypurse=4500;                                //instance variable
	int RemMoneypurse;                                 //instance variable
	int chocolates(int a) {
		int chocolatesprice= (chocolate * a);
		System.out.println("Total chocolate price:"+chocolatesprice);
		return chocolatesprice;
	}
	int cookies(int b) {
		int cookiesprice= (cookies * b);
		System.out.println("Total cookies price: "+cookiesprice);
		return cookiesprice;
	}
	
    
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);             //Scanner object creation
		System.out.print("Total quantity of chocolates : ");
		int n=sc.nextInt();
		System.out.println();
		System.out.print("Total quantity of cookies : ");
		int m=sc.nextInt();
		
		System.out.println();
		Market m1=new Market();                      //Market1 object creation
		System.out.println();
		System.out.println("Money YOU have Before Shopping :"+m1.Moneypurse);
		System.out.println();
		int productsprice= m1.chocolates(n) + m1.cookies(m);    //Total Bill
		System.out.println();
		System.out.println("Total Bill :"+productsprice);
		System.out.println();
		m1.RemMoneypurse= m1.Moneypurse - productsprice;
		
		System.out.println();
		
		System.out.println("Total Remaining purse :"+(m1.RemMoneypurse));//Money Remained in purse
		
		sc.close();
		
	}

}
