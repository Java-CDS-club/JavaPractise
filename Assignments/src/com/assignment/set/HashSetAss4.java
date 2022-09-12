//WAP to iterate through all elements in a HashSet and print the elements. Observe the order of elements.
package com.assignment.set;


import java.util.HashSet;

public class HashSetAss4{

	
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
	}
}
