package com.inheritance;

class Employee{
	int eId;
	String eName;
		
}

class Programmer extends Employee{
	String profile;
	double salary;
	
	
	public void show(int eId,String eName,String profile,double salary)
	{
		this.eId = eId;
		this.eName = eName;
		this.profile = profile;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee id: "+eId+"\nEmployee Name : "+eName+"\nDesignation : "+profile+"\nSalary : "+salary;
	}
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		Programmer p =new Programmer();
		p.show(101,"RoHit","Software developer", 10000000.00f);
		System.out.println(p);

	}

}
