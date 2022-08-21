/*	Write Laptop class with brand,cost, OperatingSystem  as properties.
 	OperatingSystem class is with osName, vendor, version.
 	a.	Write Java code to create and display all details of Laptop object.
 		Use constructor to create object of Laptop,
 	b.	Write Java code to create and display all details of Laptop object.
 		Use setter method to create object. Of Laptop.
*/

package com.test;

class OperatingSystem{
	String osName, vendor, version;
	
	//Using Constructor
	OperatingSystem(){}
	
	OperatingSystem(String osName,String vendor,String version)
	{
		this.osName = osName;
		this.vendor = vendor;
		this.version = version;
	}
	
	//Using Setter method
	public void setOsName(String osName)
	{
		this.osName = osName;
	}
	public void setVendor(String vendor)
	{
		this.vendor = vendor;
	}
	public void setVersion(String version)
	{
		this.version = version;
	}
	
	public String toString()
	{
		return "\nOperating System Name: "+osName+"\nVendor : "+vendor+
				"\nVersion : "+version;
	}	
}

class Laptop{
	String brand;
	float cost;
	OperatingSystem os;
	
	//Using Constructor
	Laptop(){}
	
	Laptop(String brand, float cost, OperatingSystem os)
	{
		this.brand = brand;
		this.cost = cost;
		this.os = os;
	}
	
	//Using Setter method
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public void setCost(float cost)
	{
		this.cost = cost;
	}
	public void setOs(OperatingSystem os)
	{
		this.os = os;
	}
	
	public String toString()
	{
		return "Brand name is : "+brand+"\nCost is : "+cost+os;
	}
	
}

public class Test4Q4 {

	public static void main(String[] args) {
		//Using Constructor
		OperatingSystem os = new OperatingSystem("Windows","Microsoft","11.01345");
		Laptop lpt = new Laptop("DELL", 65000.00f, os);
		System.out.println(lpt);
		
		System.out.println();
		
		//Using Setter method
		OperatingSystem os1 = new OperatingSystem();
		os1.setOsName("Linux");
		os1.setVendor("Unix");
		os1.setVersion("10.010101");
		
		Laptop lp = new Laptop();
		lp.setBrand("Asus");
		lp.setCost(55000.00f);
		lp.setOs(os1);
		System.out.println(lp);

	}

}
