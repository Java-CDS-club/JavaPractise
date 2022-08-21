//1. Write a Java program to check whether a number is negative, positive or zero
package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentHW1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num =sc.nextInt();
		
		if(num>=0)
		{
			if(num==0)
			{
				System.out.println("The number is Zero");
			}
			else 
			{
				System.out.println("The Number is positive");
			}
			
		}
		else
		{
			System.out.println("The Number is negative");
		}
		sc.close();
	}

}
