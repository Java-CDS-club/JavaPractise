/*	WAP to add elements to arraylist without using generics (no <>) 
 * 	and print content of it where Integer is used. 
 * 	In second arraylist String is used.
 */
package com.assignmentonarraylist;

import java.util.ArrayList;
public class Assignment1 {
	
	ArrayList al = new ArrayList();
	Assignment1()
	{
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20.5f);
		al.add("A");
		System.out.println(al);
	}
	
	public void dispInt()
	{
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i) instanceof Integer)
			{
				System.out.println(al.get(i));
			}
			else if(al.get(i) instanceof String)
			{
				System.out.println(al.get(i));
			}
		}
	
	}

	public static void main(String[] args) {
		Assignment1 obj = new Assignment1();
		obj.dispInt();

	}

}
