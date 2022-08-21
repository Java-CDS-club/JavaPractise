package com.assignmentstaticfinal;

class Car{
	static String model;
	static int totalCarSold = 10;
	int x=100;
	
	public void display()
	{
		System.out.println(totalCarSold);
		System.out.println(x);
	}
	
	public static void show()
	{
		//Cannot make a static reference to the non-static field x
//		System.out.println(x);
		System.out.println(totalCarSold);
	}
}


public class AssignmentStatic {

	public static void main(String[] args) {
		Car c = new Car();
		c.display();
		Car.show();

	}

}
