//Write a Java program to check whether a year is leap year or not 
package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentCW1 {

	public static void main(String[] args) {
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		year = sc.nextInt();
		
		if(((year % 4==0) && (year%100 != 0)) || (year%400 ==0))
		{
			System.out.println("Its a Leap year");
		}
		else
		{
			System.out.println("Its not Leap year");
		}
		sc.close();

	}

}
