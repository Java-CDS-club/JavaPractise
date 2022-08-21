////WAP to find min digit in given number
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentCW8 {

	public static void main(String[] args) {
		int num,digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		int num1 = num;
		int min = num%10;
		while(num>0)
		{
			digit = num % 10;
			if(digit<min)
			{
				min = digit;
			}
			num = num/10;
		}
		System.out.println("The Minimum digit of "+num1+" is: "+min);
		sc.close();		
	}

}
