package com.inheritance;

class Fruit{
	String color;
	float price;
	
	public void eatIt()
	{
		System.out.println("Enjoying eating food");
	}
	
	public void purchase()
	{
		System.out.println("Purchasing food");
	}
}

class DryFruit extends Fruit{
	String grade;
	float wholeSaleRate;
	
	public void export()
	{
		System.out.println("Exporting food");
	}
	public void fruitImport()
	{
		System.out.println("Importing food");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		DryFruit df = new DryFruit();
		df.eatIt();
		df.purchase();
		df.fruitImport();
		df.export();

	}

}
