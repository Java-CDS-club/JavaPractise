package com.oops;

class CreditCard
{
	public void doPayment()
	{
		System.out.println("Payment Done by Credit Card");
	}
}

class DebitCard
{
	public void doPayment()
	{
		System.out.println("Payment Done by Debit Card");		
	}
}

class NetBanking
{
	public void doPayment()
	{
		System.out.println("Payment Done by Net Banking");
	}
}


public class OverloadingExample {
	public void doPayment(CreditCard c)
	{
		c.doPayment();
		//System.out.println("Payment Done  Credit Card");
	}
	
	public void doPayment(DebitCard d)
	{
		d.doPayment();
		//System.out.println("Payment Done Debit Card");
	}
	
	public void doPayment(NetBanking n)
	{
		n.doPayment();
		//System.out.println("Payment Done Net Banking");
	}
	public static void main(String[] args) {
		
		OverloadingExample o = new OverloadingExample();
		
		CreditCard c = new CreditCard();
		o.doPayment(c);
		
		DebitCard d = new DebitCard();
		o.doPayment(d);
		
		NetBanking n = new NetBanking();
		o.doPayment(n);
	
	}

}
