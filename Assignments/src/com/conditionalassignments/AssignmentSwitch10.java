//find which is greatest  number in between 2 numbers  using switch.
package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentSwitch10 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		num2= sc.nextInt();
		
		if(num1>num2)
		{
			num1=0;
		}
		else
		{
			num1=1;
		}
			
		switch(num1)
		{
		case 0:
			System.out.println("The num1 is Maximum");
			break;
		case 1:
			System.out.println("The num2 is Maximum");
			break;
		}
		sc.close();

	}

}
