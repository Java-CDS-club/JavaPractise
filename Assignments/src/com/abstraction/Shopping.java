package com.abstraction;

abstract class PaymentMode{
	abstract public void pay();
	public void deliver()
	{
		System.out.println("Payment completed");
	}
}

abstract class Card extends PaymentMode{
	public void pay()
	{
		System.out.println("Payment type");
	}
	abstract public void payMode();
}

class CreditCard extends Card{
	public void payMode()
	{
		System.out.println("Card Using Credit Card");
	}
}

class DebitCard extends Card{
	public void payMode()
	{
		System.out.println("Card Using Debit Card");
	}
}



public class Shopping {

	public static void main(String[] args) {
		Card c = new CreditCard();
		c.pay();
		c.payMode();
		c.deliver();
		System.out.println();
		c = new DebitCard();
		c.pay();
		c.payMode();
		c.deliver();

	}

}
