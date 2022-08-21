package com.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class MyComparator implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		return i2-i1;
	}
}

public class TreeMapEx1{
	
//	TreeMap<Integer,String> tm = new TreeMap<>(new MyComparator());
	TreeMap<Integer,String> tm = new TreeMap<>(Collections.reverseOrder());
	
	TreeMapEx1()
	{
		tm.put(1, "A");
		tm.put(4, "C");
		tm.put(2, "D");
		tm.put(3, "B");
		tm.put(4, null);
		System.out.println(tm);
	}
	
	public void showMap()
	{
		System.out.println("Details : ");
		Set<Entry<Integer,String>> entrySet = tm.entrySet();
		Iterator<Entry<Integer,String>> itr = entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> e = itr.next();
			System.out.println(e);
		}
		
	}


	public static void main(String[] args) {
		TreeMapEx1 obj = new TreeMapEx1();
		obj.showMap();
	}
}
