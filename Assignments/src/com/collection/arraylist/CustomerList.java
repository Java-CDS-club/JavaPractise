package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class CustomerList {
	
	ArrayList<Customer> l;
	public CustomerList()
	{
		l = new ArrayList<Customer>();
	}
	
	public void createCustomerList()
	{
//		Customer c = new Customer();
		l.add(new Customer(101,"Aman",20));
		l.add(new Customer(102,"Ram",25));
		l.add(new Customer(103,"ken",15));
		l.add(new Customer(104,"Sham",30));
		l.add(new Customer(105,"Harsh",15));
		l.add(new Customer(106,"kll",15));
		l.add(new Customer(107,"Ham",30));
		System.out.println(l);
		
		System.out.println("Sorting using comparable : ");
		Collections.sort(l);
		System.out.println(l);
		System.out.println("Sorting opposite comparable : ");
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		
//		System.out.println("Sorting by age : ");
//		Collections.sort(l, new sortByAge());
//		System.out.println(l);
//		
//		System.out.println("Soritng age using reverse order : ");
//		Collections.sort(l,Collections.reverseOrder(new sortByAge()));
//		System.out.println(l);
//		
//		System.out.println("Sorting by id : ");
//		Collections.sort(l, new sortById());
//		System.out.println(l);
//		
//		System.out.println("Soritng id using reverse order : ");
//		Collections.sort(l,Collections.reverseOrder(new sortById()));
//		System.out.println(l);
	}
	
	
	public void showCustomerList()
	{
		System.out.println("Using for each loop : ");
		for(Customer c : l)
		{
			System.out.println(c);
		}
		
//		System.out.println("Using for loop : ");
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
//		System.out.println();
//		System.out.println("Using for Iterator : ");
//		Iterator<Customer> cl = l.iterator();
//		while(cl.hasNext())
//		{
//			Customer o = cl.next();
//			System.out.println(o);
//		}
		
		System.out.println("Sorting using descending order age: ");
		Collections.sort(l);
		for(Customer c : l)
		{
			System.out.println(c);
		}
		
	}
	
	public void findMinAge()
	{
		Iterator<Customer> cl = l.iterator();
		Customer ob = l.get(0);
		int min = ob.age;
//		System.out.println(min);
		
		//using while loop
		while(cl.hasNext())
		{
			Customer o = cl.next();
			if(min>o.age)
			{
				min = o.age;
			}
		}
		
		//Using for Loop
//		Customer o = cl.next();
//		
//		for(int i=0;cl.hasNext();o =cl.next())
//		{
//			if(min>o.age)
//			{
//				min=o.age;
//			}
//		}
		showMinAge(min);
	}
	
	public void showMinAge(int min)
	{
		System.out.println("\nMin Age Customer are : ");
		Iterator<Customer> cl = l.iterator();
		while(cl.hasNext())
		{
			Customer o1 = cl.next();
			if(min == o1.age)
			{
				Customer ob1 = o1;
				System.out.println(ob1);
			}

		}

	}
	
	public void findMaxAge()
	{
		Iterator<Customer> cl1 = l.iterator();
		Customer c = l.get(0);
		int max = c.age;
		
		Customer c1 = cl1.next();
		for(/*int i=0*/;cl1.hasNext();c1=cl1.next())
		{
			if(max<c1.age)
			{
				max = c1.age;
			}
		}
//		System.out.println(max);
		Iterator<Customer> cl2 =l.iterator(); 
		System.out.println("\nMaximum Age Customer are : ");
		while(cl2.hasNext())
		{
			Customer cm1 = cl2.next();
			if(max == cm1.age)
			{
				
				Customer cm = cm1;
				System.out.println(cm);
			}
		}
	}
	
	//Change by directly
	public void changeAge()
	{
		Iterator<Customer> itr = l.iterator();
		Customer c=itr.next();
		String s="ken";
		for(int i=0;itr.hasNext();i++,c=itr.next())
		{
			if(s.equals(c.name))
			{
				System.out.println("Name is : "+l.get(i));
				c.age=45;
				System.out.println("After Change : "+l.get(i));		
			}
		}
	}
	
	//Change by listiterator
//	public void changeAgeLI()
//	{
//		ListIterator<Customer> litr = l.listIterator();
//	}

	public void show()
	{
		System.out.println("\nUsing for each : ");
//		Consumer<Customer> c = (str) -> System.out.println(str);
//		l.forEach(c);
		l.forEach((str) -> System.out.println(str));
	}
	
	public static void main(String[] args) {
		CustomerList obj = new CustomerList();
		obj.createCustomerList();
//		obj.showCustomerList();
//		obj.findMinAge();
//		obj.findMaxAge();
//		obj.changeAge();
//		obj.show();

	}

}
