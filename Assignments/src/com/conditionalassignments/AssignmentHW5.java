/*Write a Java program to input basic salary of an employee and 
calculate its Gross salary according to following: 
Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary >20000 : HRA = 30%, DA = 95%
*/

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentHW5 {

	public static void main(String[] args) {
		int hra=0,da=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary :");
		int basicSalary = sc.nextInt();
		
		if((basicSalary>=0)&&(basicSalary<=10000))
		{
			hra = (int) (basicSalary*0.2);
			da = (int) (basicSalary*0.8);
		}
		else if(basicSalary<=20000)
		{
			hra = (int) (basicSalary*0.25);
			da = (int) (basicSalary*0.9);
		}
		else
		{
			hra = (int) (basicSalary*0.3);
			da = (int) (basicSalary*0.95);
		}
		
		int grossSalary = basicSalary + hra + da;
		System.out.println("Yout HRA on "+basicSalary+" is " +hra);
		System.out.println("Yout DA on "+basicSalary+" is " +da);	
		System.out.println("Your grossSalary is "+grossSalary);
		sc.close();
	}

}
