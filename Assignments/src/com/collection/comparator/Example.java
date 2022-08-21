package com.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Example {
	ArrayList<Float> l = new ArrayList<>();
	
	public void addEle()
	{
		l.add(12.5f);
		l.add(24.12f);
		l.add(65.14f);
		l.add(18.4f);
		System.out.println(l);
		System.out.println("Sorting  : ");
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println("Sorting using reverse order : ");
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
	}

	public static void main(String[] args) {
		Example obj = new Example();
		obj.addEle();

	}

}
