package com.collection.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {
	LinkedList<Integer> l = new LinkedList<>();
	
	public void addEle()
	{
		l.add(21);
		l.add(31);
		l.addFirst(11);
		l.addLast(51);
		l.add(3, 41);
		System.out.println(l);
		Collections.synchronizedCollection(l);
		for(Integer a: l)
		{
			System.out.println(a);
		}
	}
	public void displayLL()
	{
		System.out.println("The Linked List are : ");
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
	}
	
	public void displayRev()
	{
		ListIterator<Integer> lst;
		System.out.println("\nThe reverse Linked List are : ");
		for(lst = l.listIterator(l.size());lst.hasPrevious();)
		{
			Integer x = lst.previous();
			System.out.print(x+" ");
		}
//		System.out.println();
//		for(int i=l.size()-1;i>=0;i--)
//		{
//			System.out.print(l.get(i)+" ");
//		}
	}

	public static void main(String[] args) {
		LinkedListEx obj = new LinkedListEx();
		obj.addEle();
		obj.displayLL();
		obj.displayRev();
	}

}
