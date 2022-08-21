package com.inheritance;

class A{
	public void display()
	{
		System.out.println("This is Parent class A");
	}
}

class B extends A{
	public void bDisplay()
	{
		System.out.println("This Child class B");
	}
}

class C extends B{
	public void cDisplay()
	{
		System.out.println("This is Child class c extended by Pranet class B");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		C obj = new C();
		obj.display();
		obj.bDisplay();
		obj.cDisplay();

	}

}
