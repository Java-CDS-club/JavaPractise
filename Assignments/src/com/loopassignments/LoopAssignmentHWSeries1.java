/*Write a program to print following series
	1,22,333,4444,55555
*/

package com.loopassignments;

public class LoopAssignmentHWSeries1 {

	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}

}
