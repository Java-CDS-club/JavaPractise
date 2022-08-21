//Containtment aggregation using setter/constructor

package com.containment;

public class OutHouse {
	private int oNo;
	private float oArea;
	
//	OutHouse(){}
	
//	OutHouse(int oNo,float oArea)
//	{
//		this.oNo = oNo;
//		this.oArea = oArea;
//	}
	
	public void setONo(int oNo)
	{
		this.oNo = oNo;
	}
	
	public void setOArea(float oArea)
	{
		this.oArea = oArea;
	}
	
	public String toString()
	{
		return "OutHouse No : "+oNo+" OutHouse Area : "+oArea;
	}

}
