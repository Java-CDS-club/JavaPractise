/*	Create a list if Items. Each item has itemid, cost and name.
	Sort item list in descending order of cost.	
*/

package com.test;

import java.util.ArrayList;
import java.util.Collections;

class Item implements Comparable<Item>{
	int id; float cost;
	String name;
	
	Item(){}
	
	Item(int id,String name,float cost)
	{
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public int compareTo(Item i)
	{
		if(this.cost>i.cost)
			return -1;
		else if(this.cost<i.cost)
			return 1;
		else
			return 0;
	}
	
	public String toString()
	{
		return id+" "+name+" "+cost;
	}

}


public class Test7Q5 {
	
	ArrayList<Item> l = new ArrayList<>();
	
	public void addEle()
	{
		l.add(new Item(101,"Pen",20.0f));
		l.add(new Item(103,"Pencil",20.5f));
		l.add(new Item(102,"Eraser",10.0f));
		l.add(new Item(103,"Pencil",20.5f));
		System.out.println(l);
		System.out.println("After sorting : ");
		Collections.sort(l);
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		Test7Q5 obj = new Test7Q5();
		obj.addEle();
		

	}

}
