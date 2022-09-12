package com.collection.comparator;

public class Item implements Comparable<Item>{
	int id;String iName;float iCost;
	Item(){}
	public Item(int id,String iName,float iCost)
	{
		this.id = id;
		this.iName = iName;
		this.iCost = iCost;
	}
	
	public String toString()
	{
		return id+" "+iName+" "+iCost;
	}
	
	public int compareTo(Item i)
	{
		if(this.iCost<i.iCost)
			return -1;
		else if(this.iCost>i.iCost)
			return +1;
		else
			return 0;
	}
	
	public boolean equals(Object obj) 
	{
        if(this == obj)
        {
        	return true;
        }
	   if(obj==null || this.getClass() != obj.getClass()) 
	   {
		return false;
	   }
	   Item i=(Item)obj;
	   return this.id==(i.id) && this.iName.equals(i.iName) && this.iCost==(i.iCost);
    }

}
