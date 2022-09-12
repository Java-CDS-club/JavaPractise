package com.collection.stackandqueue;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DoubleQ {
	LinkedList<String> q = new LinkedList<>();
	
	public void createPriorityQ()
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(67);
		pq.add(45);
		pq.add(23);
		pq.add(67);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
	}

	public static void main(String[] args) {
		DoubleQ obj = new DoubleQ();
		obj.createPriorityQ();
/*		System.out.println("Adding elements : ");
		obj.q.add("A");
		obj.q.addFirst("B");
		obj.q.addLast("C");
		obj.q.add("D");
		System.out.println(obj.q);
		System.out.println("Remove Elements : ");
		obj.q.remove("B");
		System.out.println("After removing B : "+obj.q);
		obj.q.removeFirst();
		System.out.println("After removing first elemets : "+obj.q);
		obj.q.removeLast();
		System.out.println("After removing last element : "+obj.q);
*/		
	}

}
