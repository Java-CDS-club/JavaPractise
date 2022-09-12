package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Student{
	int id,phy,chem;
	String name;
	
	Student(){}
	
	Student(int id, String name,int phy,int chem)
	{
		this.id = id;
		this.name = name;
		this.phy = phy;
		this.chem = chem;
	}
	
	public String toString()
	{
		return id+" "+name+" "+phy+" "+chem;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(o!=null || this.getClass()!=o.getClass())
			return false;
		Student s = (Student) o;
		if(this.id==id && this.name.equals(s.name) && this.phy == s.phy && this.chem == s.chem)
			return true;
		else
			return false;
		
	}
}

public class Test9Q6 {
	ArrayList<Student> al = new ArrayList<>();
	ArrayList<Student> al1 = new ArrayList<>();
	
	Test9Q6()
	{
		al.add(new Student(101,"Aman",80,0));
		al1.add(new Student(101,"Aman",0,70));
		al.add(new Student(102,"Arpan",60,0));
		al1.add(new Student(102,"Arpan",0,50));
		al.add(new Student(103,"Bablu",75,0));
		al1.add(new Student(103,"Bablu",0,65));		
	}
	
	public void studentRecord()
	{
		HashSet<Student> hs = new HashSet<>();
		for(Student s : al)
		{
			for(Student s1 : al1)
			{
				if(s.id== s1.id && s.name.equals(s1.name))
				{
					Student std = new Student(s.id, s.name, s.phy, s1.chem);
					hs.add(std);
				}
			}		
		}
		System.out.println(al);
		System.out.println(al1);
		Iterator<Student> itr = hs.iterator();
		System.out.println("Student Marks : ");
		while(itr.hasNext())
		{
			Student s = itr.next();
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Test9Q6 obj = new Test9Q6();
		obj.studentRecord();

	}

}
