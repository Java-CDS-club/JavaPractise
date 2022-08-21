/*	Write a program to print following series
	1,3,7,15,31 ,….n
 */

package com.loopassignments;

public class LoopAssignmentHWSeries2 {

	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=5;i++)
		{
			n =1+(n*2);
			System.out.print(n+" ");
		}
	}
}
