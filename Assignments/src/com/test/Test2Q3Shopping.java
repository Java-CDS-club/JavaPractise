/*	Write a program with Shopping class which has overloaded method ‘doTransaction’.
 	If it has CreditCard type parameter it should display message 
 	‘You got 15% discount on bill on credit card transaction’.
 	If it has DebitCard type parameter it should display message 
 	‘No discount on bill on debit card transaction’. 
 */

package com.test;

import java.util.Scanner;

class CreditCard
{
	public void doTransaction()
	{
		System.out.println("You got 15% discount on bill on credit card transaction");
	}
}

class DebitCard
{
	public void doTransaction()
	{
		System.out.println("No discount on bill on debit card transaction");		
	}
}

public class Test2Q3Shopping {
	
	public void doTransaction(CreditCard c)
	{
		c.doTransaction();
	}

	public void doTransaction(DebitCard d)
	{
		d.doTransaction();
	}
	
	public static void main(String[] args) {
		Test2Q3Shopping o = new Test2Q3Shopping();
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Which mode you want to do Transaction");
		System.out.println("For Credit Card press : 0");
		System.out.println("For Debit card press : 1");
		System.out.println("Press number in only 0 and 1 format");
		int num = sc.nextInt();
			
		if(num == 0)
		{
			CreditCard c = new CreditCard();
			o.doTransaction(c);		
		}
		else
		{
			DebitCard d = new DebitCard();
			o.doTransaction(d);
		}
		sc.close();
	}
}
