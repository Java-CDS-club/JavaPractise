/*	WAP to create a new ArrayList, add some colors (string) and print the collection.*/
package com.assignmentonarraylist;

import java.util.ArrayList;

public class Assignment7 {
	ArrayList<String> colors = new ArrayList<>();
	ArrayList<String> al = new ArrayList<>();
	boolean al1;
	public Assignment7()
	{
		colors.add("Orange");
		colors.add("White");
		colors.add("Green");
		colors.add("black");
		colors.add("Red");
		colors.add("Purple");
		
		al.add("Purple");
		al.add("Brown");

		System.out.println(colors);
		colors.remove("Green");
		System.out.println("After remove Green color : ");
		System.out.println(colors);
//		colors.removeAll(colors);
//		System.out.println("After removing all elements :");
//		System.out.println(colors);
		
//		colors.retainAll(colors);
		System.out.println(al.retainAll(colors));
		al.retainAll(colors);
		
		System.out.println("Colors : "+colors);
		System.out.println("Al : "+al);
		
		System.out.println("Size of collection : ");
		System.out.println(colors.size());
		
		System.out.println("Check arraylist is empty or not : "+colors.isEmpty());
		
		al.removeAll(al);
		System.out.println("Check arraylist is empty or not : "+al.isEmpty());
		
	}

	public static void main(String[] args) {
		Assignment7 obj = new Assignment7();

	}

}
