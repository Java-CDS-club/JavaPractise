package com.assignmentonarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Assignment14 {
	ArrayList<Integer> al =new ArrayList<>();
	
	
	Assignment14()
	{
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		Collections.swap(al, 1, 4);
		System.out.println(al);
		Object[] o =al.toArray();
		Integer[] arr = new Integer[al.size()];
		arr = al.toArray(arr);
		
		for(Object object : o)
		{
			System.out.println(object);
		}
		
		System.out.println("Integer array value : ");
		for(Integer i : arr)
		{
			System.out.println(i);
		}
	
	}
	
	public void dispEle()
	{
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==30)
			{
				System.out.println("30 Value : "+al.get(i));
			}
		}
	}
	
	public void replaceEle()
	{
		for(int i=0;i<al.size();i++)
		{
			if(i==2)
			{
				al.set(i, 100);
			}
		}
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		Assignment14 obj = new Assignment14();
		obj.dispEle();
		obj.replaceEle();

	}
}
