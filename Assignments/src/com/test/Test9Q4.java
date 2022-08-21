/*	Consider Book class with properties bookId, bookName, bookPrice,bookAuther. 
	LinkedList of Book type is available already.    
	1.Create a TreeMap from map created in Q4.1 
	and make sure it will be sorted in descending order of Key.
	2.	Create a another from map created in Q1.4
	 	and make sure order of insertion gets maintained.
*/

package com.test;

import java.util.LinkedList;

class Book{
	int bookId, bookPrice;
	String bookName,bookAuthor;
	
	Book(){}
	
	Book(int bookId,String bookName,int bookPrice,String bookAuthor)
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}
	
	public String toString()
	{
		return "{Id : "+bookId+" Name: "+bookName+" Price: "+bookPrice+" AuthorName: "+bookAuthor+"}";
	}
}

public class Test9Q4 {
	LinkedList<Book> l = new LinkedList<>();
	
	public Test9Q4() {
		l.add(new Book(101, "Chava", 800, "Shivaji Sawant"));
		l.add(new Book(102, "Ramayan", 1000, "Maharshi Vyalmiki"));
		l.add(new Book(103, "Mahabharat", 1100, "Hrishi Vyas"));
		System.out.println(l);
	}

	public static void main(String[] args) {
		Test9Q4 obj = new Test9Q4();

	}

}
