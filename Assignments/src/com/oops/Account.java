package com.oops;

import java.util.Scanner;

public class Account {
	long acNo;
	String acName;
	float acBalance;
	
	public void acceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		acNo = sc.nextLong();
		
		System.out.println("Enter Account Name: ");
		acName = sc.next();
		
		System.out.println("Enter Account Balance: ");
		acBalance = sc.nextFloat();
		sc.close();
	}
	
	public void openAccount()
	{
		System.out.println("Account Open Succesfully..");
		System.out.println("Your Account Number is : "+acNo);
		System.out.println("Your Account Name is : "+acName);
		System.out.println("Your Balance is : "+acBalance);
		System.out.println();
	}
	
	public void depositeAmount(float amt) 
	{
		acBalance = amt + acBalance;
		System.out.println("------------------Deposite Amount-----------------");
		System.out.println("Balance after deposite "+amt+" is "+acBalance);
		System.out.println();
	}
		
	public void withdrawAmount(float amt)
	{	
		System.out.println("-----------------Withdraw Amount------------------");
		if(amt<=acBalance)
		{
			acBalance = acBalance-amt;
			System.out.println("Your amount of Rs "+amt+" Succesfulley withdraw"
			+"\n"+"Your Remaining balance is : "+acBalance);
		}
		else
			System.out.println("Insufficient Balance..!!");
	}
			

	public static void main(String[] args) {
		
		Account a = new Account();	
		
		a.acceptDetails();
		a.openAccount();
		a.depositeAmount(1500);
		a.withdrawAmount(1000);
	}
}
