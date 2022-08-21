//Write a program to calculate product of digits of any number
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW9 {

	public static void main(String[] args) {
		int num,prod=1,digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		int temp = num;
		
		while(num!=0)
		{
			digit = num % 10;
			prod = prod * digit;
			num = num / 10;			
		}
		System.out.println("The Production of "+temp+" is "+prod);
		sc.close();
	}

}
