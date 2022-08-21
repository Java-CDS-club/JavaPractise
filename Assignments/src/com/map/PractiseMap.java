package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class PractiseMap {
	HashMap<String,Integer> m;
	public PractiseMap()
	{
		m = new HashMap<String,Integer>();
		System.out.println("Map is : "+m);
	}
	public void prepareMap()
	{
		m.put(null, 100);
		m.put("abcde", 101);
		m.put("aaa", 102);
		m.put("bbb", 103);
		m.put("bbb", 105);
		m.put("bbb1", 105);
		m.put("bbb2", 103);
		m.put("bbb3", 103);
		m.put("bbb4", 103);
		m.put("bbb5", 103);
		m.put("bbb6", 103);
		m.put("bbb7", 103);
		m.put("bbb8", 103);
		m.put("bbb9", 103);
		m.put("bbb10", 103);
		m.put("bbb11", 103);
		m.put("bbb12", 103);
		m.put("bbb13", 103);
		m.put("bbb14", 103);
		m.put("bbb15", 103);
		m.put("bbb16", 103);
//		int oldNo = m.put("b", 1000);
//		System.out.println("Old Number : "+oldNo);
		System.out.println(m);
	}
	
	public void navigateMap()
	{
		Set<String> s = m.keySet();
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext())
		{
			String str = itr.next();
			if(str.length()==5)
			{
				m.put(str, m.get(str)+5);
			}

			System.out.println(str+" = "+m.get(str));
		}
	}
	

	public static void main(String[] args) {
		PractiseMap obj = new PractiseMap();
		obj.prepareMap();
		obj.navigateMap();	
	}
}
