package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Laptop {
	String name, os;
	int ram;
	
	Laptop(){}
	
	Laptop(String name, int ram, String os)
	{
		this.name = name;
		this.ram = ram;
		this.os = os;
	}
	
	public String toString()
	{
		return name+" "+ram+" "+os;
	}
	
	public int hashCode()
	{
		return name.hashCode()+os.hashCode()+ram;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o == null || this.getClass()!=o.getClass())
			return false;
		Laptop l=(Laptop) o;
		if(this.name.equals(l.name)&&this.ram == l.ram && this.os.equals(l.os))
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		HashSet<Laptop> s = new HashSet<>();
		s.add(new Laptop("Dell", 8, "Linux"));
		s.add(new Laptop("Asus", 12, "Windows"));
		s.add(new Laptop("Mac", 8, "Ios"));
		s.add(new Laptop("Hp", 4, "Linux"));
		s.add(new Laptop("Hp", 4, "Linux"));
		
		Iterator<Laptop> itr = s.iterator();
		while(itr.hasNext())
		{
			Laptop l = itr.next();
			System.out.println(l);
		}

	}

}
