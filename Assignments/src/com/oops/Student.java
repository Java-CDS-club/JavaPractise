package com.oops;

import java.util.Scanner;

public class Student {
	int rollNo,marks1,marks2,marks3;
	String name;
	
	public void acceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Student Details--------");
		System.out.println("Enter Roll No : ");
		rollNo = sc.nextInt();
		
		System.out.println("Enter Student Name : ");
		name = sc.next();
		
		System.out.println("Enter First subject Marks : ");
		marks1 = sc.nextInt();
		System.out.println("Enter Second subject Marks : ");
		marks2 = sc.nextInt();
		System.out.println("Enter Third subject Marks : ");
		marks3 = sc.nextInt();
		System.out.println();
		sc.close();
	}
	
	public void showDetails()
	{
		System.out.println("Roll No : "+rollNo);
		System.out.println("Student Name : "+name);
		System.out.println("First Subject Marks : "+marks1);
		System.out.println("Second Subject Marks : "+marks2);
		System.out.println("Third Subject Marks : "+marks3);
		System.out.println();
	}
	
	public void calculatePercentage() 
	{
		float sum = marks1+marks2+marks3;
		float per = (sum/300)*100;
		System.out.println("Percentage is: "+per);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.acceptDetails();
		s.showDetails();
		s.calculatePercentage();
	}

}
