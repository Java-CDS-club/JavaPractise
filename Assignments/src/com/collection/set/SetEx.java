package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;


public class SetEx {

	public static void main(String[] args) {
		
		HashSet<Integer> s = new HashSet<>();
		s.add(11);
		s.add(21);
		s.add(31);
		s.add(41);
		s.add(51);
		
		System.out.println("Using for loop : ");
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s);
		}
		
		System.out.println("Using Iterator : ");
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			Integer i = itr.next();
			System.out.println(i);
		}

	}

}
