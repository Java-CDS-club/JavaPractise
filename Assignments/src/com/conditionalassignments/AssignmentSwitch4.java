//Write a Java program to create Simple Calculator using switch case Menu Driven 
package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentSwitch4 {

	public static void main(String[] args) {
		int num1=0,num2=0,res=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		
		System.out.println("Please enter Choice for Operation :");
		System.out.println("+ is enter for Addition: ");
		System.out.println("- is enter for Substraction: ");
		System.out.println("* is enter for Multiplication: ");
		System.out.println("/ is enter for Division: ");
		ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case '+':
			res = num1+num2;
			break;
		case '-':
			res = num1-num2;
			break;
		case '*':
			res = num1*num2;
			break;
		case '/':
			res = num1/num2;
			break;
		default:
			System.out.println("Enter Properly");
		}
		System.out.println("The res is :"+res);
		sc.close();
	}

}
