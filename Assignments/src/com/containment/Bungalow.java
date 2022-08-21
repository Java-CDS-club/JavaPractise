//Containtment aggregation using setter/constructor

package com.containment;

public class Bungalow {
	private String bName,ownerName;
	private float area;
	OutHouse oh;
	
//	Bungalow(){}
	
//	Bungalow(String bName,String ownerName,float area,OutHouse oh)
//	{
//		this.bName = bName;
//		this.ownerName = ownerName;
//		this.area = area;
//		this.oh = oh;
//	}
	
	public void setBName(String bName)
	{
		this.bName = bName;
	}
	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}
	public void setArea(float area)
	{
		this.area = area;
	}
	public void setOh(OutHouse oh)
	{
		this.oh = oh;
	}
	
	
	public String toString()
	{
		return "Bungalow Name : "+bName+"\nBungalow OwnerName : "+ownerName+"\nBunglow total Area : "+area+"\n"+oh;
	}

}
