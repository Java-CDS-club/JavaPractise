/*	Customer class contains custName,custAge,mobile.
 	HashMap is ready with transactionID as key and Customer type Value.
	From this hashmap  get distinct age values of customers and display in ascending order of age.    
*/

package com.test;

import java.util.Collections; 
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class sortByAge implements Comparator<Customer1>{
	public int compare(Customer1 c1,Customer1 c2)
	{
		return c1.custAge-c2.custAge;
	}
	
}

class Customer1{
	String custName;
	int custAge,mobile;
	
	Customer1(){}
	
	Customer1(String custName,int custAge,int mobile)
	{
		this.custName = custName;
		this.custAge = custAge;
		this.mobile = mobile;
	}
	
	public String toString()
	{
		return "{Name: "+custName+" Age: "+custAge+" Mobile No: "+mobile+"}";
	}
}


public class Test8Q5 {
	
	HashMap<Integer,Customer1> hp = new HashMap<>();
	Test8Q5()
	{
		hp.put(1, new Customer1("Pradeep", 25, 78946123));
		hp.put(2, new Customer1("Aman", 20, 85456741));
		hp.put(3, new Customer1("Baman", 35, 88966113));
		hp.put(4, new Customer1("Raj", 15, 98866123));
		hp.put(5, new Customer1("Sham", 20, 95746941));
		System.out.println(hp);
	}
	
	public void showAge()
	{
		HashMap<Integer,Customer1> map = new HashMap<>();
		Set<Entry<Integer,Customer1>> entrySet = hp.entrySet();
		Iterator<Entry<Integer,Customer1>> itr = entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,Customer1> e = itr.next();
			Integer cage = e.getValue().custAge;
			
			if(cage == e.getValue().custAge)
			{
				if(map.containsValue(cage))
				{
					map.put(e.getKey(),e.getValue());
				}
//				System.out.println("Removed");
			}
//			else
//			{
//				map.put(e.getKey(), e.getValue());
//			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		Test8Q5 obj = new Test8Q5();
		obj.showAge();
		
		

	}

}
