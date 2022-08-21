package com.collection.arraylist;

//Assignment :- 5. WAP to iterate through all elements in an ArrayList using for loop
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx4 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> s = new ArrayList<String>();
	    s.add("Java");
	    s.add("JavaScript");
	    s.add("Python");
	    System.out.println("ArrayList: " + s);    
		
	    
	    ListIterator<String> iterate = s.listIterator();
	    System.out.println("Iterating over ArrayList:");
	    
	    for(;iterate.hasNext();)
	    {
	      System.out.print(iterate.next() + ", ");
	    }
	  

	}

}