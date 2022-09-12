/*	WAP to add user defined objects of type Employee in a HashSet.
  	Print the contents in the Set.*/
package com.assignment.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Employee implements Comparable<Employee>{
	int eId;
	String eName;
	
	Employee(){}
	Employee(int eId,String eName)
	{
		this.eId = eId;
		this.eName = eName;
	}
	
	public String toString()
	{
		return eId+" "+eName;
	}

	

	
	public int compareTo(Employee o) {
		if(this.eId<o.eId)
			return -1;
		else if(this.eId>o.eId)
			return 1;
		else
			return 0;
	}
	
	public int hashCode()
	{
		return (eId*2)+eName.hashCode();
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o==null && this.getClass() != o.getClass())
		{
			return false;
		}
		Employee e = (Employee) o;
		if(this.eId==e.eId && this.eName.equals(e.eName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class HashSetAss10 {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<>();
		hs.add(new Employee(101, "Harshu"));
		hs.add(new Employee(102, "RK"));
		hs.add(new Employee(103, "Rohit"));
		System.out.println(hs);
		
		/*11.WAP to add user defined objects of type Employee in a 
		HashSet using duplicate Employee object. Print the contents in the Set.*/
		hs.add(new Employee(102, "RK"));
		
		
		/*12.WAP to add user defined objects of type Employee which
		 *  now implements Comparable interface in a HashSet.
		 * Print the contents in the Set. 
		 * Add duplicate Employee object and print the contents in the Set. 
		 * Observe the values.*/
		System.out.println("After adding same element");
		System.out.println(hs);
		
		//13.WAP to convert a HashSet to a List/ArrayList.
		ArrayList<Employee> al = new ArrayList<>(hs);
		System.out.println("ArrayList : ");
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
