package com.collection.comparator;

import java.util.ArrayList;  
import java.util.Collections;

public class ItemList {
	ArrayList<Item> l = new ArrayList<>();
	
	public void addEle()
	{
		l.add(new Item(101,"Pen",20.0f));
		l.add(new Item(103,"Pencil",20.5f));
		l.add(new Item(102,"Eraser",10.0f));
		l.add(new Item(103,"Pencil",20.5f));
		System.out.println(l);
	}
	
	public void sorting()
	{
		System.out.println("Sorting by price in descending using compareTo : ");
		Collections.sort(l);
		System.out.println(l);
		System.out.println("Sorting price ascending using reverse order : ");
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
	}
	
	public void showOccurence()
	{
		System.out.println();

//		for(int i=0;i<l.size();i++)
//		{
//			if(l.get(i)==null)
//				continue;
//			int cnt = 1;
//			for(int j=i+1;j<l.size();j++)
//			{
//				if(l.get(i).equals(l.get(j)))
//				{
//					cnt++;
//					l.set(j,null);
//				}
//			}
//			System.out.println("The name "+l.get(i)+" Occures : "+cnt+" times");
//		}
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==null)
				continue;
			System.out.println(l.get(i)+" : Occurs "+Collections.frequency(l, l.get(i)));
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)!=null && l.get(i).equals(l.get(j)))
					l.set(j, null);
			}
		}

	}
	

	public static void main(String[] args) {
		ItemList obj = new ItemList();
		obj.addEle();
//		obj.sorting();
		obj.showOccurence();

	}

}
