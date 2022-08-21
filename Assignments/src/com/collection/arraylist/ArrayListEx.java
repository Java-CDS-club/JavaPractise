package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	
	public void addEle(ArrayList<String> s)
	{
		s.add("hi");
		s.add("hii");
		s.add("hello");
		showEle(s);
	}
	
	public void showEle(ArrayList<String> s)
	{
		System.out.println("Elemnts are : ");
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
		System.out.println();
//		revEle(s);
	}
	
	public void revEle(ArrayList<String> s)
	{
		System.out.println("Reverse List : ");
		for(int i=s.size()-1;i>=0;i--)
		{
			System.out.println(s.get(i));
		}
	}
	
	public void start(ArrayList<String> s)
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("You want to add element y : n");
		ch = sc.next().charAt(0);
		if(ch=='y')
		{
			addE(s);
		}
		else
		{
			System.out.println("Application closed");
			return;
		}
	}
	
	public void addE(ArrayList<String> s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Add element : ");
		s.add(sc.next());

		start(s);
	}

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		ArrayListEx obj = new ArrayListEx();
		//obj.addEle(s);
		obj.start(s);
		obj.showEle(s);


	}

}
