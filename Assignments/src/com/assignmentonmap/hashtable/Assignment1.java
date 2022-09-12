package com.assignmentonmap.hashtable;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Assignment1 {
	HashMap hp;
	
	Assignment1(){
		hp = new HashMap();
		
		hp.put(101, "A");
		hp.put(103, "C");
		hp.put(102, "B");
		hp.put(104,"D");
		
		System.out.println(hp);
		HashMap<String,Integer> hp1 = new HashMap<>();
		hp1.put("ABC", 123);
		System.out.println(hp1);
		
	}


	public static void main(String[] args) {
		Assignment1 obj = new Assignment1();
		TreeSet tm = new TreeSet();
		
		tm.add(1);
		tm.add(0);
		tm.add(100);
		tm.add(10);
		System.out.println(tm);	
	}
}
