/*	WAP to use add operation of ArrayList
	WAP to print all elements of ArrayList using iterator
	WAP to iterate through all elements in an ArrayList using for loop
	WAP to iterate through all elements in an ArrayList using for each
*/
package com.assignmentonarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment3to6 {
	ArrayList<Integer> al = new ArrayList<>();
	public Assignment3to6() {
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);		
	}
	
	public void displayEle()
	{
		System.out.println("Elements Display using iterator : ");
		Iterator<Integer>itr = al.iterator();
		for(;itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		System.out.println("Elements Display using for loop : ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Elements Display using for each loop : ");
		for(Integer i : al)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Assignment3to6 obj = new Assignment3to6();
		obj.displayEle();
	
	}

}
