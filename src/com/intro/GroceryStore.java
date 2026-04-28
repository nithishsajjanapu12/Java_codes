package com.intro;
import java.util.Scanner;
public class GroceryStore {
    static int RicePerKg = 50;
    static int SugarPerKg = 60;
    static int OilPerLitre = 130;
    static int MoneyinHand = 3000;
    int n,m,p;
    
    int BillofRice(int a) {
    	int RiceBill=(RicePerKg * a);
    	System.out.println("Rice bill TO be Bought by individual : "+RiceBill);
    	return RiceBill;
    }
    
    int BillofSugar(int b) {
    	int SugarBill=(SugarPerKg * b);
    	System.out.println("Sugar bill To be Bought by individual : "+SugarBill);
    	return SugarBill;
    }
    int BillofOil(int c) {
    	int OilBill= (OilPerLitre * c);
    	System.out.println("Oil bill to be bought by individual : "+OilBill);
    	return OilBill;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter KG/units of Rice an individual wanted : ");
        int n= sc.nextInt();
        System.out.println();
        System.out.print("Enter KG/units of Sugar an individual wanted : ");
        int m= sc.nextInt();
        System.out.println();
        System.out.print("Enter Litre/units of Oil an individual wanted : ");
        int p= sc.nextInt();
        System.out.println();
        
        GroceryStore gs= new GroceryStore();
        int BillofAllproducts = (gs.BillofRice(n)+gs.BillofSugar(m)+gs.BillofOil(p));
        
        System.out.println();
        if(BillofAllproducts>1000) {
        	int Discount = ((10/100) * BillofAllproducts);
        	int BillofAllproductsAfterDiscount =( BillofAllproducts - Discount);
        	BillofAllproducts = BillofAllproductsAfterDiscount;
        	System.out.println("Total Bill of all Products : "+BillofAllproducts);
        }
        else {
           System.out.println("Total Bill of all Products : "+BillofAllproducts);
        }
        System.out.println();
        
        int WalletAfterDeduction = (GroceryStore.MoneyinHand - (BillofAllproducts));
        
        System.out.println("Wallet Balance Remaining : " + WalletAfterDeduction);
        
        System.out.println();
        
        sc.close();
        
        
        
        
        
	}

}
