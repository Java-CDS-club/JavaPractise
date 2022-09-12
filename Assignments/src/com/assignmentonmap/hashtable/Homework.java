package com.assignmentonmap.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
class Fruit{
	String fruit;
	int qty;
	
	public Fruit() {}
	
	public Fruit(String fruit,int qty)
	{
		this.fruit = fruit;
		this.qty = qty;
	}
	
	public String toString()
	{
		return fruit+" "+qty;
	}
}

public class Homework {
	ArrayList<Fruit> al = new ArrayList<>();
	Homework()
	{
		al.add(new Fruit("Apple",20));
		al.add(new Fruit("Mangoe",10));
		al.add(new Fruit("Pineapple",1));
		al.add(new Fruit("Grapes",60));
		al.add(new Fruit("Pineapple",2));
		al.add(new Fruit("Apple",90));
		System.out.println(al);
	}
	
	public void totalCount()
	{
		HashMap<String,Integer> map = new HashMap<>();
		Iterator<Fruit> itr = al.iterator();
		while(itr.hasNext())
		{
			Fruit f= itr.next();
			Integer val = map.getOrDefault(f.fruit, 0);
			map.put(f.fruit, val+f.qty);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		Homework obj = new Homework();
		obj.totalCount();
	}

}
