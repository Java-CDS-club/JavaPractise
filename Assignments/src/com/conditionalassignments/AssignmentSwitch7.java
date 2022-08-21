//Write a Java program to enter number between 1to 5 and print it in word

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentSwitch7 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 5: ");
		num = sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Enter number between 1 to 5");
			break;
		}
		sc.close();

	}

}
