package com.oops;

import java.util.Scanner;

public class Semester {
	int marks1,marks2,marks3,rollNo;
	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptDetails()
	{
		
		System.out.println("Enter RollNo : ");
		rollNo = sc.nextInt();
		
		System.out.println("Enter First Subject Marks :");
		marks1 = sc.nextInt();
		
		System.out.println("Enter Second Subject Marks :");
		marks2 = sc.nextInt();
		
		System.out.println("Enter Third Subject Marks :");
		marks3 = sc.nextInt();
	}
	
	public void showDetails()
	{
		System.out.println("Roll No : "+rollNo);
		System.out.println("Subject1 Marks : "+marks1);
		System.out.println("Subject2 Marks : "+marks2);
		System.out.println("Subject3 Marks : "+marks3);
	}
}
