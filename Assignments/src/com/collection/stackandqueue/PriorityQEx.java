//Show element by descending cost

package com.collection.stackandqueue;

import java.util.Collections;
import java.util.PriorityQueue;

import com.collection.comparator.Item;

public class PriorityQEx {
	PriorityQueue<Item> pq = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQEx()
	{
		pq.add(new Item(101,"Pen",10.5f));
		pq.add(new Item(102,"Pencil",20.5f));
		
	}
	
	public void showHigherCost()
	{
		System.out.println(pq);
	}

	public static void main(String[] args) {
		PriorityQEx obj = new PriorityQEx();
		obj.showHigherCost();
				

	}

}
