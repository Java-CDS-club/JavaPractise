package com.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;


class SortByCost implements Comparator<Item1>
{
	public int compare(Item1 i1,Item1 i2)
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


class Item1 implements Comparable<Item1>{
	int iId,iCost;
	String iName;
	Item1(){}
	
	Item1(int iId,String iName,int iCost)
	{
		this.iId = iId;
		this.iName = iName;
		this.iCost = iCost;
	}
	
	public String toString()
	{
		return "Item :"+"["+iId+" "+iName+" "+iCost+"]";
	}

	@Override
	public int compareTo(Item1 o) {
		return this.iId-o.iId;
	}
}

class Supplier1{
	int sId;
	String sName;
	
	Supplier1(){}
	
	Supplier1(int sId,String sName)
	{
		this.sId = sId;
		this.sName = sName;
	}
	
	public String toString()
	{
		return "Supplier : "+"["+sId+" "+sName+"]";
	}
}


public class TreeMapEx2 {
	
	TreeMap<Item1,Supplier1> tm = new TreeMap<>(Collections.reverseOrder(new SortByCost()));
	TreeMap<Item1,Supplier> tm1 = new TreeMap<>();
	
	TreeMapEx2()
	{
		tm.put(new Item1(101, "Pen", 20), new Supplier1(1001, "ABC"));
		tm.put(new Item1(102, "Pencil", 10), new Supplier1(1002, "XYZ"));
		tm.put(new Item1(104, "Eraser", 40), new Supplier1(1003, "YXZ"));
		tm.put(new Item1(103, "Compass", 20), new Supplier1(1004, "ABC"));
		
		System.out.println(tm);
//		tm1.putAll(tm);
	}
	
	public void showMap()
	{
		System.out.println("Details : ");
		Set<Entry<Item1,Supplier1>> entrySet = tm.entrySet();
		Iterator<Entry<Item1,Supplier1>> itr = entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Item1,Supplier1> e = itr.next();
			System.out.println(e);
		}
		
		System.out.println("Using method");
		System.out.println(tm.descendingMap());
	}

	public static void main(String[] args) {
		TreeMapEx2 obj = new TreeMapEx2();
		obj.showMap();

	}

}
