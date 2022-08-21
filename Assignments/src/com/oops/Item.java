package com.oops;

public class Item {
/*	Encapsulation
 	protected int itemId;
	protected String itemName,suppName;
	protected int cost;
	
	public void setItemId(int id)
	{
		itemId = id;
	}
	
	public int getItemid()
	{
		return itemId;
	}
	
	public void setItemname(String name)
	{
		itemName = name;
	}
	
	public String getItemname()
	{
		return itemName;
	}
	
	public void setSuppname(String sname)
	{
		suppName = sname;
	}
	
	public String getSuppname()
	{
		return suppName;
	}
	
	public void setcost(int cst)
	{
		cost = cst;
	}
	
	public int getcost()
	{
		return cost;
	}
	
	
	public void acceptItemDetails(int itemNo,String itemN,String suppN,int itemCost)
	{
		itemId = itemNo;
		itemName = itemN;
		suppName = suppN;
		cost = itemCost;	
	}
*/	
	public static int itemCnt=100,objectCnt;
	public int itemId,cost;
	public String itemName,suppName;
	public static float gstValue=0.185f;
	
	public String toString()
	{
		String str = " Cost is :"+cost+" | Item name : "+itemName+
				" | Supplier name is : "+suppName;
		return str;
	}
	
	Item()
	{
		System.out.println("In Default Constructor");
		itemId = ++Item.itemCnt;
		itemName = "Mobile";
		suppName = "Samsung";
		cost = 10000;
		Item.objectCnt++;
	}
	
	Item(String iName, String iSname)
	{
		Item.objectCnt++;
		itemName = iName;
		suppName = iSname;
	}
	
	
	Item(int cst,String n,String iSn)
	{
		this(n,iSn);
		System.out.println();
		//System.out.println("In Parameterized Constructor");
		itemId = ++Item.itemCnt;
		itemName = n;
		suppName = iSn;
		cost = cst;
		
	}
	
	public void calculateBill(int qty)
	{
		
		float bill = cost*qty;
		System.out.println("The bill without gst: "+bill);
		float  gBill=bill+(bill*Item.gstValue);
		System.out.println("The bill with gst: "+gBill);
	}
	
	public static void changeGst(float gstValue)
	{	
		Item.gstValue = gstValue;		
	}	
	
	
	public void showItemDetails()
	{
		System.out.println("Item id: "+itemId+"\n" +"Item Name : "+itemName+"\n"+
							"Supplier Name : "+suppName+"\n"+"Cost is : "+cost);
	}
}
