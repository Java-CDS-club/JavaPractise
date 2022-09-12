/*	Consider Book class with properties bookId, bookName, bookPrice,bookAuther. List of Book type is available already.
	Using List of Books:   
	1.Create a Set of bookAuther from the given List and iterate
	2. Create a TreeSet of Book objects, stored according to the price in dewscending order.
	3.Create a Set from set created in Q4.1 and make sure order of insertion will be maintained.
 */
package com.test;

import java.util.ArrayList; 
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class sortByPrice implements Comparator<Book1>{
	public int compare(Book1 o1,Book1 o2)
	{
		if((o2.bookPrice-o1.bookPrice)<1)
			return -1;
		else if((o2.bookPrice-o1.bookPrice)>1)
			return 1;
		else
		{
			return o2.bookId-o1.bookId;
		}
			
	}
}

class Book1{
	int bookId,bookPrice;
	String bookName,bookAuthor;
	
	Book1(){}
	Book1(int bookId,String bookName,int bookPrice,String bookAuthor)
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}
	
	public String toString()
	{
		return bookId+" "+bookName+" "+bookPrice+" "+bookAuthor;
	}
}


public class Test8Q4 {
	ArrayList<Book1> al = new ArrayList<>();
	Test8Q4()
	{
		al.add(new Book1(101,"Ramayan",1100,"Hrishi Valmiki"));
		al.add(new Book1(102,"Mahabharat",1200,"Hrishi Vyas"));
		al.add(new Book1(103,"Missie man",800,"Vishwas Patil"));
		al.add(new Book1(104,"Agnipankh",800,"APJ Abdul Kalam"));		
	}
	
	public void createSet()
	{
		HashSet<String> hs = new HashSet<>();
		Iterator<Book1> itr = al.iterator();
		while(itr.hasNext())
		{
			Book1 b =itr.next();
			hs.add(b.bookAuthor);
		}
		System.out.println(hs);
		createOrderMaintainSet(hs);
	}
	
	public void createTreeSet()
	{
		TreeSet<Book1> ts = new TreeSet<>(new sortByPrice());
		Iterator<Book1> itr = al.iterator();
		System.out.println("Show book details descending by price : ");
		while(itr.hasNext())
		{
			Book1 b = itr.next();
			ts.add(b);
		}	
		System.out.println(ts);
	}
	
	public void createOrderMaintainSet(HashSet<String> hs)
	{
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.addAll(hs);
		System.out.println("Order Maintain Set : ");
		System.out.println(ls);
//		Iterator<String> itr = ls.iterator();
//		for(;itr.hasNext();)
//		{
//			System.out.println(itr.next());
//		}
		
	}

	public static void main(String[] args) {
		Test8Q4 obj = new Test8Q4();
		obj.createSet();
		obj.createTreeSet();
	}
}
