//WAP to accept base and index from user and calculates power
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW14 {

	public static void main(String[] args) {
		int base,index,pow=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		base = sc.nextInt();
		
		System.out.println("Enter index: ");
		index = sc.nextInt();
		
		for(int i = 1;i<=index;i++)
		{
			pow = base*pow;
		}
		System.out.println("Base is  "+base+" index is "+index+" power is = "+pow);
		sc.close();
	}

}
