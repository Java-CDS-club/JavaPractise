package com.oops;

import java.util.Scanner;

public class Book {
	int bookId,price;
	String bookName,authName;
	
	public void acceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Id : ");
		bookId = sc.nextInt();
		
		System.out.println("Enter Book Name : ");
		bookName = sc.next();

		System.out.println("Enter Author Name : ");
		authName = sc.next();	
		
		System.out.println("Enter Price : ");
		price = sc.nextInt();
		System.out.println();
		sc.close();
	}
	
	public void showDetails()
	{
		System.out.println("Book Id : "+bookId);
		System.out.println("Book Name : "+bookName);
		System.out.println("Book Author Name : "+authName);
		System.out.println("Book price : "+price);
	}
	
	public void calculateBill(int qty)
	{
		int bill = price*qty;
		System.out.println("Total bill is : "+bill);
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		b.acceptDetails();
		b.showDetails();
		b.calculateBill(3);
	}
}
