package com.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class SortByItemCost implements Comparator<Item>
{
	public int compare(Item i1,Item i2)
	{
		if(i1.iCost<i2.iCost)
			return 1;
		else if(i1.iCost>i2.iCost)
			return -1;
		else {
			/*for descending
			if(i1.iName.compareTo(i2.iName)<0)
				return 1;
			else if(i1.iName.compareTo(i2.iName)>0)
				return -1;
			else
				return 0;*/
			//for ascending
			return i1.iName.compareTo(i2.iName);
		}
	}
}

class Item{
	int iId,iCost;
	String iName;
	Item(){}
	
	Item(int iId,String iName,int iCost)
	{
		this.iId = iId;
		this.iName = iName;
		this.iCost = iCost;
	}
	
	public String toString()
	{
		return "Item :"+"["+iId+" "+iName+" "+iCost+"]";
	}
}

class Supplier{
	int sId;
	String sName;
	
	Supplier(){}
	
	Supplier(int sId,String sName)
	{
		this.sId = sId;
		this.sName = sName;
	}
	
	public String toString()
	{
		return "Supplier : "+"["+sId+" "+sName+"]";
	}
}

public class TreeMapEx {
	
	TreeMap<Item,Supplier> tm = new TreeMap<>(new SortByItemCost());
	
	TreeMapEx()
	{
		tm.put(new Item(101, "Pen", 20), new Supplier(1001, "ABC"));
		tm.put(new Item(102, "Pencil", 10), new Supplier(1002, "XYZ"));
		tm.put(new Item(104, "Eraser", 40), new Supplier(1003, "YXZ"));
		tm.put(new Item(103, "Compass", 20), new Supplier(1004, "ABC"));
		
		System.out.println(tm);
	}
	
	public void showMap()
	{
		System.out.println("Details : ");
		Set<Entry<Item,Supplier>> entrySet = tm.entrySet();
		Iterator<Entry<Item,Supplier>> itr = entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Item,Supplier> e = itr.next();
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		TreeMapEx obj = new TreeMapEx();
		obj.showMap();

	}

}
