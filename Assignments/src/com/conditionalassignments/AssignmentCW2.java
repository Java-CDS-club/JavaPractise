//Write a Java program to check whether a number is divisible by 5 and 11 or not

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentCW2 {

	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		no = sc.nextInt();
		if((no%5==0) && (no%11==0))
		{
			System.out.println("Number "+no+" is Divisible by and 11");
		}
		else
		{
			System.out.println("Number "+no+" is not Divisible by 5 and 11");
		}
		sc.close();
	}
}
