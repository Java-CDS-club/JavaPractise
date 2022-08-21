package com.test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Customer{
	int custId,custAge,noOfSeats;
	String custName,travelDate;
	
	Customer(){}
	
	Customer(int custId, String custName, int custAge,int noOfSeats, String travelDate)
	{
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
		this.travelDate = travelDate;
		this.noOfSeats = noOfSeats;
	}
	
	public String toString()
	{
		return "Id : "+custId+", Name : "+custName+", Age : "+custAge+", Seats : "+noOfSeats+", Date : "+travelDate+"\n";
	}

}

public class Test7Q2 {
	
	ArrayList<Customer> al1,al2,al3;
	HashMap<String,ArrayList<Customer>> ma;
	Test7Q2()
	{
		al1 = new ArrayList<Customer>();
		al2 = new ArrayList<Customer>();
		ma = new HashMap<String,ArrayList<Customer>>();
	}
	
	public void doBookings()
	{
		al1.add(new Customer(11,"Rk",25,3,"31-08-2022"));
		al1.add(new Customer(112,"Harsh",22,2,"31-08-2022"));
		al1.add(new Customer(13,"Rohit",26,4,"31-08-2022"));
		al1.add(new Customer(4,"Harshada",26,2,"31-08-2022"));
		al1.add(new Customer(15,"Pradeep",24,1,"31-08-2022"));
		
		al2.add(new Customer(6,"Akash",23,6,"31-08-2022"));
		al2.add(new Customer(7,"Atul",21,2,"31-08-2022"));
		al2.add(new Customer(8,"Harshad",15,4,"31-08-2022"));
		al2.add(new Customer(9,"Harshit",5,6,"31-08-2022"));
		al2.add(new Customer(10,"Rohit",28,2,"31-08-2022"));
			
		ma.put("s1", al1);
		ma.put("s2", al2);
	}
	
	public void showBookingforAllBogies()
	{
		//System.out.println(ma);
		Set<Entry<String,ArrayList<Customer>>> entryset= ma.entrySet();
		Iterator<Entry<String,ArrayList<Customer>>> itr=entryset.iterator();
		while(itr.hasNext())
		{
			Entry<String,ArrayList<Customer>> entry= itr.next();
			String bogiNum = entry.getKey();
			ArrayList<Customer> clist = entry.getValue();
			System.out.println("Customer booking for bogie : "+bogiNum);
			for( Customer c : clist)
			{
				System.out.println("\t"+c);
			}
		}	
	}
	
	public void showBookingDetails(String bogiNo)
	{
		Set<String> bogiSet = ma.keySet();
		Iterator<String> itr= bogiSet.iterator();
		System.out.println("Record of Bogie Num "+bogiNo+" :");
		while(itr.hasNext())
		{
			String b = itr.next();
			if(b.equals(bogiNo))
			{
				ArrayList<Customer> clist = ma.get(b);
				for(Customer c : clist)
				{
					System.out.println("\t"+c);
				}
			}
		}
	}
	
	public void createMap()
	{
		System.out.println("All values from map...");
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		Collection<ArrayList<Customer>> collection = ma.values();
		for(ArrayList<Customer> clist: collection)
		{
			//System.out.println(clist);
			Iterator<Customer> itr = clist.iterator();
			while(itr.hasNext())
			{
				Customer c = itr.next();
				map.put(c.custId, c.noOfSeats);
			}
		}
//		System.out.println(map);
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		Iterator<Entry<Integer,Integer>> itr = entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,Integer> e = itr.next();
			System.out.println("Id is : "+e.getKey()+" "+"No of Seats : "+e.getValue());		
		}

	}


	

	public static void main(String[] args) {
		Test7Q2 obj = new Test7Q2();
		obj.doBookings();
		//obj.showBookingforAllBogies();
		//obj.showBookingDetails("s2");
		obj.createMap();

	}

}
