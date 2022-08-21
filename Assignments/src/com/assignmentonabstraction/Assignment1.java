package com.assignmentonabstraction;

abstract class Machine{
	abstract public void crush();
	
	public void rotate()
	{
		System.out.println("Rotating..");
	}
}

class Juicer extends Machine{
	public void crush()
	{
		System.out.println("Crush juicer fruits in machine");
	}
	
	public void filter()
	{
		System.out.println("Filtering..");
	}
}

abstract class M{
	
}

abstract class Mixer extends Machine{
	public void crush() 
	{
		System.out.println("Crush in Machine");
	}
	public void blend()
	{
		System.out.println("Blended...");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Juicer j = new Juicer();
		j.rotate();
		j.crush();
		j.filter();
		
		Machine m = new Juicer();
		m.rotate();
		m.crush();
	
	}

}
