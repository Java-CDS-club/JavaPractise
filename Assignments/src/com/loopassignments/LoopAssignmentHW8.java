//Write a program to count number of digits in any number
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW8 {

	public static void main(String[] args) {
		int num,cnt=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for count Digit: ");
		num = sc.nextInt();
		int temp = num;
		
		while(num%10!=0)
		{
			cnt++;
			num = num / 10;
		}
		System.out.println("Total Digit in "+temp+" is "+cnt);
		sc.close();
	}

}
