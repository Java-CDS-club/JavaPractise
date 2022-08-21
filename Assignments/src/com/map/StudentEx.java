package com.map;

import java.util.HashMap;

public class StudentEx {
	HashMap<Integer,Float> m= new HashMap<>();
	
	public void prepareMap()
	{
		m.put(101,50.5f);
		m.put(102,60.2f);
		m.put(78,67.5f);
		m.put(75,50.9f);
		m.put(103,45.5f);
		
		System.out.println(m);
		m.remove(78);
		System.out.println("After removing 78 key :");
		System.out.println(m);
		System.out.println("Check 75 key available or not : "+m.containsKey(75));
		System.out.println("Check 50.5 weight value is avalaible or not : "+m.containsValue(50.5f));
		System.out.println("Key valu pair remove : "+m.remove(103,45.5f));
		m.clear();
		System.out.println("After removing all element : "+m);
	}

	public static void main(String[] args) {
		StudentEx obj = new StudentEx();
		obj.prepareMap();

	}

}
