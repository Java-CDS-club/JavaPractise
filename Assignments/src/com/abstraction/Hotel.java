package com.abstraction;

abstract class Food{
	abstract public void receipe();
	abstract public void ingredients();
	public void parcel(String s)
	{
		System.out.println("Parcel of food : "+s);
	}
}

class Paratha extends Food{
	public void receipe()
	{
		System.out.println("Receipe of food");
	}
	public void ingredients() {
		System.out.println("Ingredients are :potato,oil,cheeze");
	}
}

class Noodles extends Food{
	public void receipe()
	{
		System.out.println("Receipe of food");
	}
	public void ingredients() {
		System.out.println("Ingredients are  :noodles,oil,onion");
	}
}



public class Hotel {

	public static void main(String[] args) {
		Food f = new Paratha();
		f.receipe();
		f.ingredients();
		f.parcel("Paratha");
		System.out.println();
		f = new Noodles();
		f.receipe();
		f.ingredients();
		f.parcel("Noodles");

	}

}
