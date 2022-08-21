package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx5 {
	ArrayList<Integer> l = new ArrayList<>();
	
	public void addEle()
	{
		l.add(2);
		l.add(4);
		l.add(5);
		l.add(2);
		l.add(2);
		l.add(6);
		l.add(4);
		System.out.println(l);
	}
	
	public void removeDuplicateEle()
	{
//		for(int i=0;i<l.size();i++)
//		{
//			for(int j=i+1;j<l.size();j++)
//			{
//				if(l.get(i).equals(l.get(j)))
//				{
//					l.remove(l.get(j));
//				}
//			}
//		}
//		System.out.println(l);
		
		Iterator itr = l.iterator();
		for(int i=0;itr.hasNext();i++)
		{
			int no = (int)itr.next();
			if(l.get(i).equals(no))
			{
				l.remove(i);
			}
		}
		System.out.println(l);
		


		
	}

	public static void main(String[] args) {
		ArrayListEx5 obj = new ArrayListEx5();
		obj.addEle();
		obj.removeDuplicateEle();

	}

}
