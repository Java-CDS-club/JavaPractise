package com.assignment.set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetAss {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(51);
		hs.add(21);
		hs.add(41);
		hs.add(11);
		hs.add(31);
		System.out.println("HashSet : ");
		for(Integer i : hs)
		{
			System.out.print(i+" ");
		}
		//5.WAP to get the number of elements in a HashSet.
		System.out.println("\nTotal Number of elements in HashSet : "+hs.size());
		
		//6.WAP to empty a HashSet.
		HashSet h = new HashSet();
		
		//7.WAP to test if a HashSet is empty or not.
		System.out.println(h.isEmpty());
		
		//8.WAP to convert a HashSet to an array.
		Integer arr[] = new Integer[hs.size()];
		hs.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		//9.WAP to convert a HashSet to an array.
		h.addAll(hs);
		System.out.println(h);
		h.removeAll(h);
		System.out.println("h "+h);
	}

}
