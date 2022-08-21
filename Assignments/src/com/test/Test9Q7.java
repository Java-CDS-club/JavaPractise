/* Create class Laptop with members modelno,brand,price,RAM. Create Set of Laptop Objects. 
	Write a code to remove Laptop Objects with brand DELL. 
	After that sort all remaining  objects in Set by RAM capacity in ascending order.
*/
package com.test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class sortByRam implements Comparator<Laptop1>
{
	public int compare(Laptop1 l,Laptop1 l1)
	{
		//return l.ram-l1.ram;
		if(l.ram<l1.ram)
			return -1;
		else if(l.ram>l1.ram)
			return 1;
		else
		{
			return l.modelNo-l1.modelNo;
		}
	}
}


class Laptop1{
	int modelNo,price,ram;
	String brand;
	
	Laptop1(){}
	
	Laptop1(int modelNo,String brand,int ram,int price)
	{
		this.modelNo = modelNo;
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	public String toString()
	{
		return modelNo+" "+brand+" "+ram+" "+price;
	}
	
/*	public int hashCode()
	{
		return brand.hashCode()+ram+price+modelNo;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(o == null || this.getClass()!=o.getClass())
			return false;
		Laptop1 l = (Laptop1)o;
		if(this.modelNo==l.modelNo && this.brand.equals(l.brand) && this.price==l.price && this.ram == l.ram)
			return true;
		else
			return false;
	}*/

}
public class Test9Q7 {
	HashSet<Laptop1> hs = new HashSet<>();
	Test9Q7(){
		hs.add(new Laptop1(100001, "Dell", 4, 50000));
		hs.add(new Laptop1(100002, "Asus", 8, 45000));
		hs.add(new Laptop1(100003, "hp", 16, 55000));
		hs.add(new Laptop1(100005, "Acer", 2, 50000));
		hs.add(new Laptop1(100006, "Lenovo", 2, 50000));
		hs.add(new Laptop1(100007, "Mac", 12, 80000));
		System.out.println(hs);
	}

	public void removeBrand()
	{
		Iterator<Laptop1> itr = hs.iterator();
		System.out.println("Remove Dell object : ");
		while(itr.hasNext())
		{
			Laptop1 l = itr.next();
			if(l.brand.equals("Dell"))
			{
				itr.remove();
			}
		}	
		System.out.println(hs);
	}
	
	public void ascendingByRam()
	{
		System.out.println("Ascending by RAM : ");
		TreeSet<Laptop1> ts=new TreeSet<Laptop1>(new sortByRam());
		Iterator<Laptop1> itr1 = hs.iterator();
		while(itr1.hasNext())
		{
			Laptop1 e = itr1.next();
			ts.add(e);
		}
		System.out.println(ts);
	}

	
	public static void main(String[] args) {
		Test9Q7 obj = new Test9Q7();
		obj.removeBrand();
		obj.ascendingByRam();
	}

}
