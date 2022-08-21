//WAP to print table of given no
package com.loopassignments;

import java.util.Scanner;

public class LoopAssignmentHW12 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		sc.close();
	}
}
