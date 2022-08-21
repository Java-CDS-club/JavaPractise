package com.inheritance;

class Apartment{
	String aName;
	String Address;
	
	public void display()
	{
		System.out.println("Apartment details");
	}
}

class Flat extends Apartment{
	int fNo;
	
	public void displayF()
	{
		System.out.println("Flat details");
	}
}

class Owner extends Flat{
	String ownName;
	
	public void show(String aName,String Address,int fNo,String ownName)
	{
		this.aName = aName;
		this.Address = Address;
		this.fNo = fNo;
		this.ownName = ownName;
	}
	
	public String toString()
	{
		return "Aparment Name : "+aName+"\nAdress : "+Address+"\nFlat No : "+fNo+
				"\nOwner name : "+ownName;
	}
}

public class Multilevelinheritance1 {

	public static void main(String[] args) {
		Owner o = new Owner();
		o.display();
		o.show("Shivai", "Deopur", 26, "Harsh");
		System.out.println(o);

	}

}
