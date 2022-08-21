/*Write a program that displays the day of the week corresponding to the number entered.
i.e., 1 - "Monday", 2- "Tuesday" and so on.*/
package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentSwitch5 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 to 7 for display days: ");
		num1 = sc.nextInt();
		
		switch(num1)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;			
		case 7:
			System.out.println("Sunday");
			break;
		default :
			System.out.println("Enter number between 1 to 7");
		}
		sc.close();
		
	}

}
