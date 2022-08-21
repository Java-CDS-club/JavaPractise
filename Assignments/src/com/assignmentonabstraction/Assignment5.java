package com.assignmentonabstraction;

abstract class Parent{
	public abstract void cook();
	public void wash()
	{
		System.out.println("Washing..");
	}
}

class Child extends Parent{
	public void cook()
	{
		System.out.println("Cooking...");
	}
}


public class Assignment5 {

	public static void main(String[] args) {
		Child c = new Child();
		c.cook();
		c.wash();
	}

}
