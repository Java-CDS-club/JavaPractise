/*	WAP to sort the elements of List that contains Integer objects.
	Print ArrayList.Sort using Collections.sort(list) method.Print ArrayList.
*/

package com.assignment.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(51);
		al.add(21);
		al.add(11);
		al.add(31);
		al.add(41);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting : ");
		System.out.println(al);

		
	}

}
