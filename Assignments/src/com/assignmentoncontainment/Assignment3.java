package com.assignmentoncontainment;

class Address{
	private String city;
	private String state;
	private String country;
	
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public String toString()
	{
		return "\nCity : "+city+"\nState : "+state+"\nCountry :"+country;
	}
}

class Person{
	private String pName;
	private char pGender;
	private int pAge;
	Address ad;
	
	public void setPNAme(String pName)
	{
		this.pName = pName;
	}
	public void setPGender(char pGender)
	{
		this.pGender = pGender;
	}
	public void setPAge(int pAge)
	{
		this.pAge = pAge;
	}
	public void setAd(Address ad)
	{
		this.ad = ad;
	}
	
	public String toString()
	{
		return "Persona Name: "+pName+"\nGender : "+pGender+"\nAge : "+pAge+
				ad;
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		Address a = new Address();
		a.setCity("Dhule");
		a.setState("Maharashtra");
		a.setCountry("India");
		
		Person p = new Person();
		p.setPNAme("Rohit");
		p.setPGender('M');
		p.setPAge(26);
		p.setAd(a);
		
		System.out.println(p);
		

	}

}
