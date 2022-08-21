package com.collection.arraylist;

import java.util.ArrayList;

public class ArrayListEx1 {
	
	public void addEle(ArrayList<Integer> i)
	{
		for(int j=1;j<=20;j++)
		{
			if(j%2==0)
				i.add(j);
		}
		showEle(i);
	}
	
	public void showEle(ArrayList<Integer> i)
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<>();
		ArrayListEx1 obj = new ArrayListEx1();
		obj.addEle(i);

	}

}
