package com.assignmentonarraylist;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


//class SortbyDept implements Comparator<Employee>
//{
//	public int compare(Employee e,Employee e1)
//	{
//		return e1.dept.compareTo(e.dept);
//	}
//
//}

class Employee implements Comparable<Employee>{
	int id,sal;
	String name,dept;
	
	Employee(){}
	
	Employee(int id,String name,int sal,String dept)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	
	public String toString()
	{
		return "Id : "+id+" Name : "+name+" Salary : "+sal+" Department : "+dept;
	}
	
	public int compareTo(Employee e)
	{
		return this.sal-e.sal;
	}
}


public class Assignment24 {
	ArrayList<Employee> al = new ArrayList<>();
	ArrayList<Employee> al1 = new ArrayList<>();
	ArrayList<Employee> al2 = new ArrayList<>();
	Assignment24() {
		al.add(new Employee(101, "Navin", 100,"Sales"));
		al.add(new Employee(104, "Nancy", 20000,"R&D"));
		al.add(new Employee(103, "Sachin", 40000,"Service"));
		al.add(new Employee(106, "Aman", 10000,"Dev"));
		al.add(new Employee(105, "Sana", 400000,"Testing"));
		al.add(new Employee(107, "Navin", 1000,"Sales"));
		al.add(new Employee(106, "Navin", 100,"Sales"));
//		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

//		al1.addAll(al);

//		al1.add(new Employee(102, "Harsh", 20000,));
//		al.add(new Employee(102, "Harshit", 15000));
//
//		System.out.println("New ArrayList : "+al1);
//
//		Collections.sort(al1);;
//		for(Employee a: al1)
//			System.out.println(a);
//		System.out.println();
//		
//		Collections.copy(al, al1);
//		for(Employee e1 : al)
//			System.out.println(e1);

	}
	
	public void showSal()
	{
		Iterator<Employee> itr = al.iterator();
		System.out.println("Employee details who has Salary more than 1000 : ");
		while(itr.hasNext())
		{
			Employee e = itr.next();
			if(e.sal>1000)
			{
				System.out.println(e);
			}
		}
	}
	
	public void showEmpName()
	{
		Iterator<Employee> itr = al.iterator();
		System.out.println("Employee Details who has name Sachin : ");
		for(;itr.hasNext();)
		{
			Employee e = itr.next();
			if(e.name.equals("Sachin"))
				System.out.println(e);
		}
	}
	
	public void highSal()
	{
		Iterator<Employee>itr = al.iterator();
		Employee e = al.get(0);
		int max = e.sal;
		System.out.println("Highest Salary of Employee  : ");
		while(itr.hasNext())
		{
			Employee ep = itr.next();
			if(max<ep.sal)
			{
				max = ep.sal;
			}
		}
		System.out.println(max);
		
		System.out.println("Highest Salary EMployee Record : ");
		Iterator<Employee>itr1 = al.iterator();
		for(;itr1.hasNext();)
		{
			Employee emp = itr1.next();
			if(max == emp.sal)
			{
				System.out.println(emp);
			}
		}
	}
	
	public void checkArrList()
	{
		if(al.equals(al1))
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	public void showDeptName()
	{
		System.out.println("Department Name: ");
//		HashSet<String> hs = new HashSet<String>();
		TreeSet<String> hs = new TreeSet<String>(Collections.reverseOrder());
		Iterator<Employee> itr = al.iterator();
		while(itr.hasNext())
		{
			Employee e = itr.next();
			hs.add(e.dept);
		}
		System.out.println(hs);
		
	}
	
	public void showSalDecn()
	{
		System.out.println("Salary descending : ");
//		HashSet<String> hs = new HashSet<String>();
		TreeSet<Integer> hs = new TreeSet<Integer>(Collections.reverseOrder());
		Iterator<Employee> itr = al.iterator();
		while(itr.hasNext())
		{
			Employee e = itr.next();
			hs.add(e.sal);
		}
		System.out.println(hs);
		
	}
	
	
	public static void main(String[] args) {
		Assignment24 obj = new Assignment24();
//		obj.showSal();
//		obj.showEmpName();
//		obj.highSal();
//		obj.checkArrList();
		obj.showDeptName();
		obj.showSalDecn();
	}
}
