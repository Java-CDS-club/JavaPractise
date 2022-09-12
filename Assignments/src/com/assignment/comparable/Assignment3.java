/*	WAP to create a class Employee with (name, designation and age).
	Now create and add Employee objects elements to Arraylist. Print ArrayList.
	
	Now modify Employee class so that it implements Comparable interface’s compareTo method.
	Sorting should be done based on id in which use < , > & == technique.
*/

package com.assignment.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	String name,designation;
	int age;
	
	Employee(String name,String designation,int age)
	{
		this.name = name;
		this.designation = designation;
		this.age = age;
	}
	
	public String toString(){
		return name+" "+designation+" "+age;
	}
	
	/*Now modify Employee class so that it implements Comparable interface’s compareTo method.
	Sorting should be done based on id in which use < , > & == technique.*/

//	public int compareTo(Employee e) {
//		if(this.age<e.age)
//			return -1;
//		else if(this.age>e.age)
//			return 1;
//		else
//			return 0;
//	}
	
	/*	Now do sorting on id but based on inbuilt compareTo method. Ensure to check 3 null conditions*/
	
	public int compareTo(Employee o) {
		return 0;
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Harsh", "Senior Tester", 26));
		al.add(new Employee("RK", "Senior Developer", 26));
		al.add(new Employee("Pradeep", "Project Manager", 25));
		al.add(new Employee("Aman", "Ast Manager", 15));
		al.add(new Employee("Ram", "HR", 20));
		
		
		System.out.println(al);
		//Collections.sort(al);
		System.out.println("After sorting by age : ");
		System.out.println(al);

	}

}
