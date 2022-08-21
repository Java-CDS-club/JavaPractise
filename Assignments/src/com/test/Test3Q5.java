/*	Create array of Employee type with size 10
 	display record of employee with highest salary.
 */
package com.test;

import java.util.Scanner;

class Employee{
	int eId;
	String eName;
	float eSalary;
	
	
	Employee(int eId,String eName,float eSalary)
	{
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	public String toString()
	{
		return "Employee id : "+eId+" Employee Name : "+eName+" Salary : "+eSalary;
	}
	
}

public class Test3Q5 {
	
	public void acceptEmpRec(Employee a[])
	{
		int eId; String eName; float eSalary;
		System.out.println("Enter Employee record : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Employee id :");
			eId = sc.nextInt();
			System.out.println("Enter Employee Name : ");
			eName = sc.next();
			System.out.println("Enter Salary : ");
			eSalary = sc.nextFloat();
			
			a[i] = new Employee(eId,eName,eSalary);
		}
		sc.close();		
	}
	
	public void showEmpRecord(Employee a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	
	public void showMaxSal(Employee a[])
	{
		float max=a[0].eSalary;
		int maxI =0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i].eSalary)
			{
				max = a[i].eSalary;
				maxI = i;
			}
		}
		System.out.println("The Maximum Salary Employee Details : \n"+a[maxI]);
	}

	public static void main(String[] args) {
		Employee e[];
		e = new Employee[3];
		
		Test3Q5 o = new Test3Q5();
		o.acceptEmpRec(e);
		o.showEmpRecord(e);
		o.showMaxSal(e);		
	}
}
