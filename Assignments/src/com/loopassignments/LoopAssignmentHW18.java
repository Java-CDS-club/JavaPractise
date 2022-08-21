//WAP to check given no is automorphic or not
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW18 {

	public static void main(String[] args) {
		int num;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		num = sc.nextInt();
		
		int square = num*num;
		
		while(num>0)
		{
			if(num%10!=square%10)
			{
				flag = false;
			}
			else
			{
				flag = true;
			}
			num = num/10;
			square = square /10;
		}
		if(flag == true)
			System.out.println("Atomorphic");
		else
			System.out.println("Not a atomorphic");
		sc.close();
	}

}
