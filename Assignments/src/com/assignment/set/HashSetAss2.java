//WAP to create a HashSet with some colors (String) using generics
package com.assignment.set;

import java.util.HashSet;
public class HashSetAss2 {

	public static void main(String[] args) {
		HashSet<String> colors = new HashSet<>();
		colors.add("Red");
		colors.add("Black");
		colors.add("White");
		colors.add("Orange");
		System.out.println(colors);

	}

}
