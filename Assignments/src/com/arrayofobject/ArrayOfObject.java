package com.arrayofobject;

//import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObject {
	
	public void acceptItemDetails(Item a[])
	{
		int id;String iName;float price;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Item Record : ");
			System.out.println("Enter Item id:");
			id = sc.nextInt();
			System.out.println("Enter Item Name: ");
			iName = sc.next();
			System.out.println("Enter Item Cost : ");
			price = sc.nextFloat();
			
			a[i] = new Item(id,iName,price);
		}
		sc.close();
	}
	
	public void showItemDetails(Item a[])
	{
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void showPrice(Item a[])
	{
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i].price == 20)
				System.out.println(a[i]);
		}
	}
	
	

	public static void main(String[] args) {
		Item a[];
		a= new Item[2];
			
		ArrayOfObject o = new ArrayOfObject();
		o.acceptItemDetails(a);
		o.showItemDetails(a);
		o.showPrice(a);

		
//		Item i1 = new Item(101, "Pen", 30.00f);
//		Item i2 = new Item(102, "Pencil", 15.00f);
//		Item i3 = new Item(101, "Compass", 50.00f);
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
		
	}
}


class Item{
	int id;
	String iName;
	float price;
	
	Item(int id,String iName,float price)
	{
		this.id = id;
		this.iName = iName;
		this.price = price;
	}
	
	public String toString()
	{
		return "Item id : "+id+" Item Name : "+iName+" Item Price : "+price;
	}
		
}
