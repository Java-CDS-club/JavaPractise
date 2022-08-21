//Write a Java program to check whether a number is even or odd using switchcase 
package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentSwitch2 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		num = sc.nextInt();
		

		switch(num % 2)
		{
		case 0:
		{
			System.out.println("The number is even");
			break;
		}
		case 1:
		{
			System.out.println("The number is odd");
			break;
		}
		}
		sc.close();
	}
}

