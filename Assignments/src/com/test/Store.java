/*	Create a class Store which has fields like :
	-noOfItemsAvailable
	-maximumLevel 
	-minimumLevel 
	Create methods in Store class – addItem(), removeItem,checkStock()
a.	While removing Item from stock, It should take care that minimum level
	Should always be maintained for that item. If it goes below minimum level 
	Application should generate  ItemStockUnderFlowException.
b.	While adding Item to stock, It should take care that maximum level
	Should always be maintained for that item. If it goes above maximum level 
	Application should generate  ItemStockOverFlowException.
*/

package com.test;

import java.util.Scanner;

class ItemStockUnderFlowException extends RuntimeException{
	
	public String getMessage()
	{
		return"Item level is below with minimum level";
	}
}

class ItemStockOverFlowException extends RuntimeException{
	
	public String getMessage()
	{
		return"Item level is overflow with maximum level";
	}
}

public class Store {
	int noOfItemsAvailable=10,maximumLevel=15,minimumLevel=5;
	static int itemNo;
	int addI,removeI;

	
	
	public void addItem(int itemNo)
	{
		//boolean storage = checkStock();
		
//		if(storage == true)
//		{
//			noOfItemsAvailable+= itemNo;
//			System.out.println("Item added in stock succesfully.. Total Number of Items in stock is : "+noOfItemsAvailable);
//		}
//		else
//		{
//			throw new ItemStockOverFlowException();
//		}
		
		if(noOfItemsAvailable+itemNo>=maximumLevel)
		{
			throw new ItemStockOverFlowException();
		}
		else
			noOfItemsAvailable+=itemNo;
		checkStock();
		System.out.println("Updated item stock : "+noOfItemsAvailable);
	}
	public void removeItem(int itemNo)
	{
//		boolean storage = checkStock();
//		if(storage == true)
//		{
//			noOfItemsAvailable-= itemNo;
//			System.out.println("Item remove from stock succesfully.. Total Number of Items in stock is : "+noOfItemsAvailable);
//		}
//		else
//		{
//			throw new ItemStockUnderFlowException();
//		}
		if(noOfItemsAvailable-itemNo<=minimumLevel)
		{
			throw new ItemStockUnderFlowException();
		}
		else
			noOfItemsAvailable-=itemNo;
		checkStock();
		System.out.println("Updated item stock : "+noOfItemsAvailable);
		
		
	}
	public int checkStock()
	{
		return noOfItemsAvailable;

		
		
//		if(itemNo <= maximumLevel && itemNo>=minimumLevel)
//			return true;
//		else
//			return false;

	}

	public static void main(String[] args) {
		try {
			Store s = new Store();
			System.out.println("Number of Items are : "+s.noOfItemsAvailable);
			Scanner sc = new Scanner(System.in);
			System.out.println("Select 0 for Add Item and 1 for Remove Item: ");
			String input = sc.next();
			if(input.equals("0"))
			{
				System.out.println("Enter Item for add: ");
				itemNo = sc.nextInt();
				s.addItem(itemNo);
			}
				
			else
			{
				System.out.println("Enter Item for remove: ");
				itemNo = sc.nextInt();
				s.removeItem(itemNo);				
			}
			sc.close();
		}
		catch(ItemStockOverFlowException e)
		{
			System.out.println("Error Message  : "+e.getMessage());
			System.out.println("Error occured: "+e);
		}
		catch(ItemStockUnderFlowException e)
		{
			System.out.println("Error Message  : "+e.getMessage());
			System.out.println("Error occured: "+e);
		}
		finally {
			System.out.println("Record Updated..");
		}


	}

}
