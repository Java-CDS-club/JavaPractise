package com.test;

import java.util.Scanner;

interface TaxPayer{
	void payTax();
}

class Person{
	String name,address;
	int age;
	
	public void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Address : ");
		address = sc.nextLine();
		System.out.println("Enter Age : ");
		age = sc.nextInt();
		sc.close();
	}
	
	public void showDetails()
	{
		System.out.println("Person Details :- ");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Age : "+age);
	}
}

class Employye extends Person implements TaxPayer{
	int empId;
	float basic,hra,da,grossSalary;
	
	Employye(){}
	
	Employye(int empId,float basic,float hra,float da)
	{
		this.empId = empId;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
	}
	
	public void calSalary()
	{
		grossSalary = basic+hra+da;
	}
	
	public void showEmpDetails()
	{
		System.out.println("Salary Details :- ");
		System.out.println("Id : "+empId);
		System.out.println("Basic : "+basic);
		System.out.println("House Rent Allowance : "+hra);
		System.out.println("Dearness Allowance : "+da);
		System.out.println("Gross Salary : "+grossSalary);
	}
	public void payTax()
	{
		System.out.println("Your Tax payable amount is : "+grossSalary*0.1);
	}
}

class Vp extends Employye{
	float bonus=5000.0f;
	float totSal;
	Vp()
	{
		super(101,40000.0f,2500.0f,1500.0f);
		super.calSalary();
	}
	public void calSalary()
	{
		totSal = grossSalary+bonus;
		System.out.println("Total salary : "+totSal);
	}
	
}


public class Test5Q4 {

	public static void main(String[] args) {
		Vp obj = new Vp();
		obj.getDetails();
		obj.showDetails();
		System.out.println("--------------------------------------");
		obj.showEmpDetails();
		obj.payTax();
		obj.calSalary();	

	}

}
