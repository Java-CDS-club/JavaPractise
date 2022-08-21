//WAP to print sum of given digit

package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentCW9 {

	public static void main(String[] args) {
		int num,sum = 0,digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		int temp =num;
		while(num!=0)
		{
			digit = num%10;
			sum = sum+digit;
			num=num/10;
		}
		System.out.println("The sum of "+temp+" is "+sum);
		sc.close();
	}
}
