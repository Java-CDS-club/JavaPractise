//Write a java to program to create Simple Calculator

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentCW5 {

	public static void main(String[] args) {
		int no1,no2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		no1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		no2 = sc.nextInt();
		
		System.out.println("Press + for Addition :");
		System.out.println("Press - for Substraction :");
		System.out.println("Press * for Multiplication :");
		System.out.println("Press / for Division :");
		char ch =sc.next().charAt(0);
		
		switch(ch)
		{
			case '+':
				System.out.println("Addition is : "+no1+no2);
				break;
				
			case '-':
				System.out.println("Substraction is : "+(no1-no2));
				break;

			case '*':
				System.out.println("Multiplication is : "+no1*no2);
				break;

			case '/':
				System.out.println("Division is : "+no1/no2);
				break;
				
			default :
				System.out.println("Wrong Choice");
				break;
		
		}
		sc.close();
			
	}

}
