//remove elements using iterator
package com.collection.arraylist;

import java.util.ArrayList; 
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx3 {
	
	public void addEle(ArrayList<String> o)
	{
		o.add("hi");
		o.add("hello");
		o.add("keep");
		o.add("world");
		System.out.println(o);
	}
	
	public void removeEle(ArrayList<String> o)
	{
		Iterator<String> itr = o.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			if(str.length()>=5)
			{
				itr.remove();
				System.out.println(str+" content removed");
			}
		}
		System.out.println(o);
	}
	
	public void revEle(ArrayList<String> o)
	{
		System.out.println("Reverse element is : ");
		
		//iterate using while loop
/*		ListIterator<String> litr = o.listIterator(o.size());
		while(litr.hasPrevious())
		{
			String str = litr.previous();
			System.out.println(str);
		}
*/		
		ListIterator<String> litr;
		for(litr = o.listIterator(o.size());litr.hasPrevious();)
		{
			String str = litr.previous();
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> o = new ArrayList<>();
		ArrayListEx3 obj  = new ArrayListEx3();
		obj.addEle(o);
		obj.removeEle(o);
		obj.revEle(o);
	}
}
