package com.javafundamentals;



public class Insurance1 {
	static String company_name="xyz";
	static int insurance_fee=500;
	static int amount=1500;
	static int  days=10;
	
	static int dailyrate()
	{
		return amount;
	}
	
	static int insurancefee( )
	{
		return insurance_fee;	
	
	}
	
	static int baseamount(int days )
	{
		int c=days*dailyrate();
		return c;
	}
	
	static void totalamount(int c)
	{
		int total_amount=c+insurancefee();
		System.out.println(total_amount);
	    //return total_amount;
		//System.out.println(total_amount);
	}
	
	
	
	
	static void welcome()
	{
		System.out.println(company_name);
		//dailyrate();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		dailyrate();
		insurancefee();
		baseamount(days);
		totalamount(baseamount(days));
		
		

	}

}
