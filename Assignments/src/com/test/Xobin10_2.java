package com.test;

//import java.util.Arrays; 
//import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Xobin10_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String input_from_question=sc.nextLine();
		String a[]=input_from_question.split(" ");
		//System.out.println(Arrays.toString(a));
		input_from_question="";
		HashMap<String,Integer> hp=new HashMap<String,Integer>();
		for(int i=0;i<a.length;i++)
		{
			Integer val=hp.getOrDefault(a[i],0);
			hp.put(a[i], val+1);
		}
		
		Set<Entry<String,Integer>> s=hp.entrySet();
		Iterator<Entry<String,Integer>> itr=s.iterator();
		while(itr.hasNext())
		{
			Entry<String,Integer> c=itr.next();
			input_from_question+=c.getKey()+"\n"+c.getValue()+"\n";
		}
				
      System.out.println(input_from_question);
      sc.close();
	}

}