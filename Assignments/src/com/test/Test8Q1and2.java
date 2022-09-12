package com.test;

import java.util.Collections; 
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class sortByPercentage implements Comparator<Candidate>
{
	public int compare(Candidate o1, Candidate o2) {
		return  o1.percentage < o2.percentage ? 1 : -1;
	}	
}

class sortByCid implements Comparator<Candidate>
{
	public int compare(Candidate o1, Candidate o2) {
		return  o1.cid-o2.cid;
	}	
}

class Candidate {
	int cid,m1,m2,m3;
	String cName;
	float percentage;
	
	Candidate() {}
	
	Candidate(int cid,String cName,int m1,int m2,int m3)
	{
		this.cid = cid;
		this.cName = cName;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.percentage = ((m1+m2+m3)*100)/300;
	}
	
	public String toString()
	{
		return cid+" "+cName+" "+m1+" "+m2+" "+m3+" "+percentage+"%";
	}
}

public class Test8Q1and2 {
	PriorityQueue<Candidate> pq =new PriorityQueue<Candidate>(new sortByPercentage());
	
	Test8Q1and2() {
		pq.add(new Candidate(101,"Pradeep",80,90,95));
		pq.add(new Candidate(102,"Raj",40,50,55));
		pq.add(new Candidate(103,"Vyom",50,60,65));
		pq.add(new Candidate(104,"Om",50,50,50));
		System.out.println(pq);
		
//		System.out.println("Data descending by percentage : ");
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }
	}
	
	public void createTreeSet()
	{
		TreeSet<Candidate> ts = new TreeSet<>(Collections.reverseOrder(new sortByCid()));
		while (!pq.isEmpty()) 
		{
			ts.add(pq.poll());
		}
		
		System.out.println("TreeSet : ");
		System.out.println(ts);	
		System.out.println("First Element in TreeSet : "+ts.first() );
		System.out.println("First Element in TreeSet : "+ts.last() );
	}

	public static void main(String[] args) {
		Test8Q1and2 obj = new Test8Q1and2();
		obj.createTreeSet();

	}

}
