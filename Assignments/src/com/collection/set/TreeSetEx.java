package com.collection.set;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(11);
		ts.add(21);
		ts.add(31);
		ts.add(41);
		ts.add(1);
		System.out.println(ts);
		
		TreeSet<Integer> ts1 = new TreeSet<>(Collections.reverseOrder());
		ts1.add(21);
		ts1.add(11);
		ts1.add(31);
		ts1.add(41);
		ts1.add(1);
		
		System.out.println("Reverse tree set : ");
		System.out.println(ts1);

	}

}
