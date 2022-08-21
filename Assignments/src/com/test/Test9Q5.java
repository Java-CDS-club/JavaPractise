package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

//class sortByMovieName implements Comparator<Movie>{
//	public int compare(Movie m1,Movie m2)
//	{
//		return m1.movieName.compareTo(m2.movieName);
//	}
//}

class Actor{
	int actorId;
	String actorName;
	
	Actor() {}
	
	Actor(int actorId,String actorName)
	{
		this.actorId = actorId;
		this.actorName = actorName;
	}
	
	public String toString()
	{
		return actorId+" "+actorName;
	}
}

class Movie{
	String movieName,producer;
	int budget,role;
	
	Actor a;
	
	Movie(){}
	
	Movie(String movieName,String producer,int budjet,int role,Actor a)
	{
		this.movieName = movieName;
		this.producer = producer;
		this.budget = budjet;
		this.role = role;
		this.a = a;		
	}
	
	public String toString()
	{
		return movieName+" "+producer+" "+budget+" "+role+" "+a;
	}

}

public class Test9Q5 {
	ArrayList<Movie> al = new ArrayList<>();
	
	Test9Q5(){
		al.add(new Movie("M.S.Dhoni", "Raju",700000,5, new Actor(101,"SSR")));
		al.add(new Movie("3Idiots", "Hirani",600000,3, new Actor(102,"R Madhvan")));
		al.add(new Movie("Wanted", "Mahesh",100000,1, new Actor(103,"Solemon")));
		System.out.println(al);
	}
	
	public void createTreeMap()
	{
		System.out.println("Movie Name with Actor Name : ");
		TreeMap<String,String> tm = new TreeMap<>(Collections.reverseOrder()); 
		Iterator<Movie> itr = al.iterator();
		while(itr.hasNext())
		{
			Movie m =itr.next();
			tm.put(m.movieName, m.a.actorName);
		}
		System.out.println(tm);
	}
	
	public void createLinkedHashMap()
	{
		System.out.println("Actor name with play role: ");
		LinkedHashMap<String,Integer> lmp = new LinkedHashMap<>();
		Iterator<Movie> itr =al.iterator();
		while(itr.hasNext())
		{
			Movie m = itr.next();
			lmp.put(m.a.actorName, m.role);
		}
		System.out.println(lmp);
	}
	public void maxRole()
	{
		TreeMap<String,Integer> tm = new TreeMap<>();
		Iterator<Movie> itr =al.iterator();
		while(itr.hasNext())
		{
			Movie m = itr.next();
			tm.put(m.a.actorName, m.role);
		}
		Collection<Integer> c = tm.values();
		int max = Integer.MIN_VALUE;
		for(Integer i : c)
		{
			if(max<i)
				max = i;
		}
		System.out.println(max);
		Iterator<Movie> itr1 = al.iterator();
		while(itr1.hasNext())
		{
			Movie m = itr1.next();
			if(m.role == max)
			{
				System.out.println(m.a.actorName+" played role : "+m.role);
			}
		}
	}

	public static void main(String[] args) {
		Test9Q5 obj = new Test9Q5();
		obj.createTreeMap();
		obj.createLinkedHashMap();
		obj.maxRole();

	}

}
