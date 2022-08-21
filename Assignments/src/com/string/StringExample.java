package com.string;

public class StringExample {

	public static void main(String[] args) {
		Book b = new Book(101, 2000.00f, "CHAVA");
		Book b1 = new Book(101, 2000.00f, "CHAVA");
		if(b.equals(b1))
			System.out.println("Both object value are equal");
		else
			System.out.println("Not equal");
	}

}

class Book{
	int bid;
	float price;
	String bname;
	
	Book(){}
	Book(int bid,float price,String bname)
	{
		this.bid = bid;
		this.price = price;
		this.bname = bname;
	}
	
	public String toString()
	{
		return "Book is "+bname+" is id "+bid+" cost Rs."+price;
	}
	
	public boolean equals(Object obj)
	{
		Book b = (Book) obj;
		if(this.bid==b.bid && this.bname==b.bname && this.price==b.price)
			return true;
		else
			return false;
	}
}
