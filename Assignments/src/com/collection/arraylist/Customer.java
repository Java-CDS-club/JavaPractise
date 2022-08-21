package com.collection.arraylist;

public class Customer implements Comparable<Customer> {
	int id,age;
	String name;
	
	public Customer() {};
	public Customer(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return id+","+name+","+age;
	}
	
	public int compareTo(Customer c)
	{
		if(this.age<c.age)
			return 1;
		else if(this.age>c.age)
			return -1;
		else {
			return 0;
//				if(this.name.compareTo(c.name)<0)
//					return 1;
//				else if(this.name.compareTo(c.name)>0)
//					return -1;
//				else
//					return 0;
			}
	}


}
