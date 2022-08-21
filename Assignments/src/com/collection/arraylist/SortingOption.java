package com.collection.arraylist;

import java.util.Comparator;

class sortById implements Comparator<Customer>
{
	public int compare(Customer c1, Customer c2)
	{
		return c1.id-c2.id;
	}
}

class sortByAge implements Comparator<Customer>
{
	public int compare(Customer c1, Customer c2)
	{
		return c1.age-c2.age;
	}
}




public class SortingOption {

}
