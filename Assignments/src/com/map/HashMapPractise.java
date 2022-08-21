package com.map;

import java.util.HashMap;

class Student{
	int rollNo,marks;
	String name;
	
	Student(){}
	Student(int rollNo,String name,int marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString()
	{
		return rollNo+" "+name+" "+marks;
	}
	
	public int hashCode()
	{
		int ans=0;
		ans = rollNo+(marks*2)+name.hashCode();
		return ans;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(o == null)
			return false;
		if(this.getClass()!=o.getClass())
			return false;
		
		Student s = (Student)o;
		if(this.rollNo==s.rollNo && this.marks == s.marks && this.name.equals(s.name))
			return true;
		else
			return false;
	}
}

public class HashMapPractise {

	public static void main(String[] args) {
		HashMap<Student,String> map = new HashMap<>();
		Student o = new Student(101,"Abc",85);
		Student o1 = new Student(101,"Abc",85);
		System.out.println(o.hashCode());
		System.out.println(o1.hashCode());
		
		map.put(o, "AAA");
		map.put(o1, "BBB");
		System.out.println(map);
		

	}

}
