package com.inheritance;

class Vehicle{
	int wheeler;
	String color;
	
	public void display()
	{
		System.out.println("Select type of Vehicle");
	}
}

class Car extends Vehicle{
	String cName;
	float price;
	
	public void showCarDetails(int wheeler,String color,String cName,float price)
	{
		this.wheeler = wheeler;
		this.color = color;
		this.cName = cName;
		this.price = price;
	}
	
	public String toString()
	{
		return "Wheeler : "+wheeler+"\nColor : "+color+"\nCar Name: "+cName+
				"\nCar Price : "+price;
	}
}

class Bike extends Vehicle{
	String bName;
	float price;
	
	public void showBikeDetails(int wheeler,String color,String bName,float price)
	{
		this.wheeler = wheeler;
		this.color = color;
		this.bName = bName;
		this.price = price;
	}
	
	public String toString()
	{
		return "Wheeler : "+wheeler+"\nColor : "+color+"\nBike Name: "+bName+
				"\nBike Price : "+price;
	}
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Car c = new Car();
		c.display();
		c.showCarDetails(4, "Black", "BMW", 1000000.00f);
		System.out.println(c);
		System.out.println();
		Bike b = new Bike();
		b.display();
		b.showBikeDetails(2, "Black", "Ducati", 2000000.00f);
		System.out.println(b);

	}

}
