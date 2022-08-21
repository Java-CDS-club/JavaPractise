package com.oops;

public class MethodOverloading {
	public void calculateArea(int x,int y)
	{
		System.out.println("Area of rectangle : "+ x*y);
	}
	
	public void calculateArea(float x,float y)
	{
		System.out.println("Area of Circle : "+ x*(y*y));
	}
	
	public void calculateArea(float x,int y)
	{
		System.out.println("Area of Triangle is :"+ 0.5*x*y);
	}
	
	

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.calculateArea(3.14f, 10f);

	}

}