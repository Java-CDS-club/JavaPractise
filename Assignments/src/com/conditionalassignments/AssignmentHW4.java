//Write a Java program print total number of days in a month
package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentHW4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		int month= sc.nextInt();
		
		if((month ==1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month ==10)||(month==12))
		{
			System.out.println("The Number of days in this month is 31");
		}
		else if((month == 4)||(month == 6)||(month == 9)||(month == 11))
		{
			System.out.println("The Number of days in this month is 30");
		}
		else if(month == 2)
		{
			System.out.println("The Number of days in this month is 28 or 29");
		}
		else
		{
			System.out.println("Enter number between 1 to 12");
		}
		sc.close();
	}

}
