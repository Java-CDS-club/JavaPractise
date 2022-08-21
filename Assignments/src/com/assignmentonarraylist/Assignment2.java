/*	WAP add elements to arraylist without using generics, 0th location keep Integer,
   	1st location String now print each element and display contents.
*/
package com.assignmentonarraylist;

import java.util.ArrayList;

public class Assignment2 {
	
	ArrayList al;
	
	public Assignment2() {
		al = new ArrayList();
		al.add(10);
		al.add("A");
		System.out.println(al);
	}

	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();

	}

}
