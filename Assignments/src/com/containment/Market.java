package com.containment;

public class Market {
	private String mName;
	private String mLocation;
	Shop sp,sp1;
	
	Market(){}
	
//	Market(String mName,String mLocation,Shop sp,Shop sp1)
//	{
//		this.mName = mName;
//		this.mLocation = mLocation;
//		this.sp = sp;
//		this.sp1 = sp1;
//	}
	
	Market(String mName,String mLocation)
	{
		this.mName = mName;
		this.mLocation = mLocation;
		sp = new Shop(101,"Nokia Store");
		sp1 = new Shop(102,"Mi Mobiles");
	}
	
	

//	public void setMName(String mName)
//	{
//		this.mName = mName;
//	}
//	
//	public void setMLocation(String mLocation)
//	{
//		this.mLocation = mLocation;
//	}	
//	
//	public void setSp(Shop sp)
//	{
//		this.sp = sp;
//	}
//	
//	public void setSp1(Shop sp1)
//	{
//		this.sp1 = sp1;
//	}
	
	public String toString()
	{
		return "Market Name :"+mName+"\nMarket Location :"+mLocation+" "+sp+sp1;
	}

}
