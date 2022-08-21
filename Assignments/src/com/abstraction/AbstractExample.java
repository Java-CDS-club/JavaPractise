package com.abstraction;

abstract class Shape{
	public void fillColor(String s)
	{
		System.out.println("Color filled with "+s);
	}
	abstract public void describeShape();
}

class GeometricalShape extends Shape{
	
	public void describeShape()
	{
		System.out.println("This is Geometrical shape");
		fillBorderColor("Red");
	}
	
	public void fillBorderColor(String bc)
	{
		System.out.println("Border color is : "+bc);
	}
}

class FreeHandShape extends Shape{
	
	public void describeShape()
	{
		System.out.println("This is Free form shape");
	}
}


public class AbstractExample {

	public static void main(String[] args) {
		Shape s = new GeometricalShape();
		s.fillColor("Black");
		s.describeShape();
		s = new FreeHandShape();
		s.describeShape();
	}

}
