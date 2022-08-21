package com.containment;

public class Shop {
	private int sNo;
	private String sName;
	
	Shop(){}
	
	Shop(int sNo,String sName)
	{
		this.sNo = sNo;
		this.sName = sName;
	}

//	public void setSNo(int sNo)
//	{
//		this.sNo = sNo;
//	}
//	
//	public void setSName(String sName)
//	{
//		this.sName = sName;
//	}
	
	
	public String toString()
	{
		return "\nShop No: "+sNo+"\nShop Name :"+sName;
	}

}
