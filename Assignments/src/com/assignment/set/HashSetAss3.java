//WAP to create a HashSet from an ArrayList
package com.assignment.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetAss3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(11);
		al.add("Twenty One");
		al.add(31);
		al.add(41);
		al.add(31);
		System.out.println("ArrayList : "+al);
		System.out.println("Converting hashset to arraylist");
		
		HashSet hs = new HashSet(al);
		
//		HashSet hs = new HashSet();
//		hs.addAll(al);
		System.out.println("HashSet : "/*+hs*/);
		Iterator itr = hs.iterator();
		for(;itr.hasNext();)
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n"+hs.getClass());

	}

}
