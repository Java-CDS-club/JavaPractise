//Write a Java program to check whether a number is even or odd
package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentHW3 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		num = sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The number is Odd");
		}
		sc.close();
	}

}
