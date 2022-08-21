/* Write a program to print following series
	1,2,4,7,11,16,22,29 
*/
package com.loopassignments;

public class LoopAssignmentHWSeries3 {

	public static void main(String[] args) {
		for(int i=0;i<=7;i++)
		{
			int n =1+((i*(i+1))/2);
			System.out.print(n+" ");
		}	
	}
}
