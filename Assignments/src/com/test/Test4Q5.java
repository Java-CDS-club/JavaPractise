/*	Create array of Employee type with size 5.
	Employee class has empId,empNAme,salary properties.		
	a.	Display record of employee with highest salary.		
	b.	Display record of employees with salary above 60000.		
	c.	Display record of employees with salary same as salary of Manoj.	
	d.	Display average salary of all employees.	
*/


package com.test;

import java.util.Scanner;


class Employeee{
	int empId;
	String empName;
	float salary;
	
	Employeee(){}
	
	Employeee(int empId,String empName,float salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Employee id : "+empId+"\nEmployee Name : "+empName+
				"\nSalary : "+salary;
	}
}


public class Test4Q5 {
	public void acceptDetails(Employeee e[])
	{
		int id;String iName;float salary;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Employee Record :- ");
			System.out.println("Enter Employee id:");
			id = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			iName = sc.next();
			System.out.println("Enter Employee salary : ");
			salary = sc.nextFloat();
			
			e[i] = new Employeee(id,iName,salary);
		}
		sc.close();
	}
	
	//Display Employee Details
	public void showDetails(Employeee e[])
	{
		System.out.println("Details of Employee : ");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
	}
	
	//Display highest salary
	public void highSalary(Employeee e[])
	{
		System.out.println();
		System.out.println("Employee details of highest salary : ");
		float max = e[0].salary;
		int maxIndex = 0;
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary>max)
			{
				max = e[i].salary;
				maxIndex = i;
			}
		}
		System.out.println(e[maxIndex]);
	}
	
	//Display salary above 60000
	public void salaryAboveSixty(Employeee e[])
	{
		System.out.println();
		System.out.println("Employee details of salary above 60000 : ");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary>60000)
			{
				System.out.println(e[i]);
			}
		}
	}
	
	//Display record of employee whose salary same as Manoj
	public void sameSalary(Employeee e[])
	{
		System.out.println();
		System.out.println("Employee details of salary same as manoj salary : ");
		float sal=0;
		for(int i=0;i<e.length;i++)
		{
			if((e[i].empName).equals("Manoj"))
			{
				sal = e[i].salary;
			}
		}
		for(int i=0;i<e.length;i++)
		{
			if((sal == e[i].salary) && !(e[i].empName).equals("Manoj"))
			{
				System.out.println(e[i]);
			}
		}
	}
	
	//Display Average salary of all Employees
	public void displayAverage(Employeee e[])
	{
		System.out.println();
		System.out.println("Average salary of Employees : ");
		float sum =0;
		int cnt = 0;
		for(int i=0;i<e.length;i++)
		{
			sum+=e[i].salary;
			cnt++;
		}
		float average = sum/cnt;
		System.out.println(average);
	}

	public static void main(String[] args) {
		Employeee e[] = new Employeee[5];
		
		Test4Q5 o = new Test4Q5();
		o.acceptDetails(e);
		o.showDetails(e);
		o.highSalary(e);
		o.salaryAboveSixty(e);
		o.sameSalary(e);
		o.displayAverage(e);
	}

}
