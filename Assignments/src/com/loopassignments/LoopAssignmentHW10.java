//Write a program to find frequency of each digit in a given integer.

package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW10 {

	public static void main(String[] args) {
		int num,digit,cnt=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		for(int i=0;i<=9;i++)
		{
			cnt = 0;
			temp = num;
			
			while(temp!=0)
			{
				digit = temp%10;
				if(i==digit)
				{
					cnt++;
				}
				temp = temp/10;
			}
			if(cnt>0)
			{
				System.out.println(i+" "+" "+cnt);				
			}
			
		}
		sc.close();
	}

}
