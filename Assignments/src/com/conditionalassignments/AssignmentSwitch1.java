// Write a Java program print total number of days in a month using switch case 

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentSwitch1 {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		month = sc.nextInt();
		
		switch(month)
		{
		case 1:
		{
			System.out.println("The total days in this month is 31");
			break;
		}
		case 2:
		{
			System.out.println("The total days in this month is 28 or 29");
			break;
		}
		case 3:
		{
			System.out.println("The total days in this month is 31");
			break;
		}
		case 4:
		{
			System.out.println("The total days in this month is 30");
			break;
		}
		case 5:
		{
			System.out.println("The total days in this month is 31");
			break;
		}
		case 6:
		{
			System.out.println("The total days in this month is 30");
			break;
		}
		case 7:
		{
			System.out.println("The total days in this month is 31");
			break;
		}
		case 8:
		{
			System.out.println("The total days in this month is 31");
			break;
		}
		case 9:
		{
			System.out.println("The total days in this month is 30");
			break;
		}
		case 10:
		{
			System.out.println("The total days in this month is 31");
			break;
		}
		case 11:
		{
			System.out.println("The total days in this month is 30");
			break;
		}
		case 12:
		{
			System.out.println("The total days in this month is 31");
			break;
		}
		default :
			System.out.println("Please enter Number between 1 to 12");		
		}
		sc.close();
	}
}

