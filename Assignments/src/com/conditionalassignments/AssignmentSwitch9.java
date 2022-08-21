/*WAP in java using switch case for following: 
Area of a circle 
Area of a square 
Area of a right angled triangle 
Area of a rectangle 
Circumference of a circle 
Perimeter of a square Accept inputs like radius,side,etc through keyboard.
Menu driven program using switch case:*/


package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentSwitch9 {

	public static void main(String[] args) {
		float radius,side;
		double res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the choice :");
		System.out.println("Please enter 1 for Area of Circle: ");
		System.out.println("Please enter 2 for Area of Square: ");
		System.out.println("Please enter 3 for Area of Rectangle: ");
		System.out.println("Please enter 4 for Circumference of Circle: ");
		System.out.println("Please enter 5 for Perimeter of Square: ");
		System.out.println();
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
		{
			System.out.println("Please enter radius ");
			radius = sc.nextFloat();
			res = 3.14*radius*radius;
			System.out.println("Area of circle is :"+res);
			break;
		}
		case 2:
		{
			System.out.println("Please enter side: ");
			side = sc.nextFloat();
			res = side*side;
			System.out.println("Area of Square is :"+res);
			break;
		}
		case 3:
		{
			int length,breath;
			System.out.println("Please enter length and breath :");
			length = sc.nextInt();
			breath = sc.nextInt();
			res = length*breath;
			System.out.println("Area of Rectangle is :"+res);
			break;
		}
		case 4:
		{
			System.out.println("Enter radius :");
			radius = sc.nextFloat();
			res = 2*3.14*radius;
			System.out.println("Circumference of Circle is :"+res);
			break;
		}		
		case 5:
		{
			System.out.println("Enter side :");
			side = sc.nextFloat();
			res = 4*side;
			System.out.println("Perimeter of Square is :"+res);
			break;
		}
		default:
			System.out.println("Enter Number Correctly..");
		
		}
		sc.close();

	}

}
