//Write a program to find sum of all even numbers between 1 to n
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW6 {

	public static void main(String[] args) {
		int num,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%2 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("The Addition of all even number is: "+sum);
		sc.close();
	}

}
