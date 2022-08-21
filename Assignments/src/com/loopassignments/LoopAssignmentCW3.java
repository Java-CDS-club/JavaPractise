//WAP to take number from user and print its table
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentCW3 {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int res= num*i;
			System.out.println(res);		
		}
		sc.close();

	}

}
