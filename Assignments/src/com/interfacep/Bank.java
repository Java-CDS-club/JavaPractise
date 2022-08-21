package com.interfacep;

class School implements Calculator, SciCalculator{
	public int add(int x,int y) 
	{
		return x+y;
	}
	public void multi(int a,int b)
	{
		System.out.println("Multiplication is : "+a*b);
	}
	public int calSquare(int x)
	{
		return x*x;
	}
}


public class Bank implements Calculator{
	float iRate = 7.2f;
	public int add(int x, int y)
	{
		System.out.println("Calculating matured amount");
		return ((x+y)+(int)iRate/100)+(x+y);
	}
	public void multi(int a, int b)
	{
		System.out.println("Multiplication is : "+a*b);
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Matured amount is : "+b.add(400, 35));
		b.multi(10, 10);
		System.out.println("------------------------------");
		School s = new School();
		System.out.println("Addition is : "+s.add(20, 50));
		s.multi(10, 5);
		System.out.println("Square is : "+s.calSquare(10));
	}
}
