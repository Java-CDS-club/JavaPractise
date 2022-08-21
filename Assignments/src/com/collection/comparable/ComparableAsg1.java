package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableAsg1 {
	
	ArrayList<String> l = new ArrayList<>();
	
	public void addEle()
	{
		l.add("Ball");
		l.add("Cat");
		l.add("Apple");
		l.add("Dog");
		System.out.println(l);
		Collections.sort(l);
		System.out.println("After Sorting :");
		System.out.println(l);
	}

	public static void main(String[] args) {
		ComparableAsg1 obj = new ComparableAsg1();
		obj.addEle();

	}

}
