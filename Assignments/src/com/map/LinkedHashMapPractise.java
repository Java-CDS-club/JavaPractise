package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMapPractise {
	LinkedHashMap<Integer,String> lmap = new LinkedHashMap<>();
	
	LinkedHashMapPractise()
	{
		lmap.put(101, "A");
		lmap.put(102, "B");
		lmap.put(104, "C");
		lmap.put(102, "D");
		System.out.println(lmap);
	}
	public static void main(String[] args) {
		LinkedHashMapPractise obj = new LinkedHashMapPractise();

	}

}
