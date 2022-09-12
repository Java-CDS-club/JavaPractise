/*	WAP to sort the elements of List that contains String objects.
 	Print ArrayList.Sort using Collections.sort(list) method. Print ArrayList.
*/

package com.assignment.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment1{

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Raj");
		al.add("Aman");
		al.add("Harsh");
		al.add("Zack");
		
		Collections.sort(al);
		
		System.out.println(al);

	}

}
