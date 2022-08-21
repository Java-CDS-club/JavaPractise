package com.collection.arraylist;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListOccurence {
	ArrayList<Integer> l = new ArrayList<>();
	ArrayList<String> sl = new ArrayList<String>(); 
	
	public void addEle()
	{
		l.add(11);
		l.add(12);
		l.add(11);
		l.add(11);
		l.add(13);
		l.add(12);
		l.add(14);
		System.out.println(l);
		
//		Iterator<Integer> itr = l.iterator();
//		for(int i=0;itr.hasNext();i++,itr.next())
//		{
//			System.out.print(l.get(i)+" ");
//		}
		
		sl.add("Ram");
		sl.add("Sham");
		sl.add("Ram");
		sl.add("Ram");
		sl.add("Harsh");
		sl.add("Kiran");
		sl.add("Harsh");
	}
	
	public void showOccureneceInteger()
	{
//		Iterator<Integer> itr = l.iterator();
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==-1)
				continue;
			int cnt=1;
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)==l.get(j))
				{
					cnt++;
					l.set(j, -1);
				}
			}
			System.out.println("The element "+l.get(i)+" Occures : "+cnt+" times");
		}
	}
	
	public void showOccurenceString()
	{
//		Iterator<String> itr = sl.iterator();
		System.out.println();
		System.out.println(sl);
		for(int i=0;i<sl.size();i++)
		{
			if(sl.get(i).equals("\0"))
				continue;
			int cnt = 1;
			for(int j=i+1;j<sl.size();j++)
			{
				if(sl.get(i).equals(sl.get(j)))
				{
					cnt++;
					sl.set(j, "\0");
				}
			}
			System.out.println("The name "+sl.get(i)+" Occures : "+cnt+" times");
		}
	}
	public static void main(String[] args) {
		ArrayListOccurence obj  = new ArrayListOccurence();
		obj.addEle();
		obj.showOccureneceInteger();
		obj.showOccurenceString();
		

	}

}
