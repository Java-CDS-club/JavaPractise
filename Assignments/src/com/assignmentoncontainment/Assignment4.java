package com.assignmentoncontainment;

class MyDate{
	private int day,month,year;
	
	MyDate(){}
	
	MyDate(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString()
	{
		return day+"-"+month+"-"+year;
	}
}

class Dept{
	private int dId;
	private String dName;
	
	Dept(){}
	
	Dept(int dId,String dName)
	{
		this.dId = dId;
		this.dName = dName;
	}
	
	public String toString()
	{
		return "Dept Id : "+dId+"\nDept Name : "+dName;
	}
}

class Employee{
	private int eId;
	private String eName;
	private float salary;
	Dept dpt;
	MyDate md;
	
	Employee() {}
	
	Employee(int eId,String eName,float salary,Dept dpt,MyDate md)
	{
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.dpt = dpt;
		this.md = md;
	}
	
	public String toString()
	{
		return "Emp id : "+eId+"\nEmp Name : "+eName+"\nEmp Salary : "+salary+
				"\n"+dpt+"\n"+md;
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		Dept d = new Dept(101, "Developer");
		MyDate m = new MyDate(25, 11, 2022);
		
		Employee e = new Employee(001, "Rohit", 1000000.00f, d, m);
		System.out.println(e);

	}

}
