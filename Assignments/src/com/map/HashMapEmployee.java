package com.map;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


class Employee{
	int eId,eSalary,deptId;
	String eName;
	
	Employee(){}
	Employee(int eId,String eName,int eSalary,int deptId)
	{
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.deptId = deptId;
	}
	
	public String toString()
	{
		return eId+" "+eName+" "+eSalary+" "+deptId;
	}
}

public class HashMapEmployee {
	ArrayList<Employee> al = new ArrayList<>();
	public HashMapEmployee() {
		al.add(new Employee(101,"Navin",24000,1001));
		al.add(new Employee(102,"Navya",34000,1002));
		al.add(new Employee(103,"Nancy",6000,1001));
		al.add(new Employee(104,"Nilam",6000,1002));
	}
	
	public void showEmpDetails()
	{
		//System.out.println(al);
		Iterator<Employee> itr = al.iterator();
		System.out.println("Employee Details are : ");
		while(itr.hasNext())
		{
			Employee e = itr.next();
			System.out.println("Id : "+e.eId+" Name : "+e.eName+
					" Salary : "+e.eSalary+" Dept Id : "+e.deptId);
		}
	}
	
	public void totalSalaryExpense()
	{
		HashMap<Integer,ArrayList<Employee>> mp = new HashMap<>();
		mp.put(1, al);
//		System.out.println(ma);
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		Collection<ArrayList<Employee>> collection = mp.values();
		for(ArrayList<Employee> elist: collection)
		{
			//System.out.println(clist);
			Iterator<Employee> itr = elist.iterator();
			while(itr.hasNext())
			{
				Employee e = itr.next();
				Integer sal = map.getOrDefault(e.deptId, 0);
				map.put(e.deptId, e.eSalary+sal);
				
//				Integer sal =map.put(e.deptId, e.eSalary);
//				System.out.println(sal);
//				if(sal!=null)
//				{
//					map.put(e.deptId, sal+e.eSalary);
//				}
			}
		}
	
		//System.out.println(map);
		System.out.println("Total Salary Expenses with Department : ");
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		Iterator<Entry<Integer,Integer>>itr = entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,Integer> e = itr.next();
			System.out.println("Dept Id :"+e.getKey()+" "+"Total Salary Expense : "+e.getValue());
		}
	}

	public static void main(String[] args) {
		HashMapEmployee obj = new HashMapEmployee();
		obj.showEmpDetails();
		obj.totalSalaryExpense();

	}

}
