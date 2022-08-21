//WAP to check given no is palindrome or not.
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW17 {

	public static void main(String[] args) {
		int num,rev = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of check palindrome or not: ");
		num = sc.nextInt();
		
		for(int i =num;i>0;i=i/10)
		{
			rev = i%10;
			sum = (sum*10)+rev;
		}
		if(num == sum)
			System.out.println(num+" is Palindrome");			
		else
			System.out.println(num+" is not Palindrome");
		
		sc.close();
	}
}
