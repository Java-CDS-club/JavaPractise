/*	WAJP2 find sum of each row and column of a matrix.
*/

package com.assignment2darray;

import java.util.Scanner;

public class Assignment4 {
	
	public void showSumRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int rowSum =0;
			for(int j=0;j<a[i].length;j++)
			{
				rowSum = rowSum + a[i][j];
			}	
			System.out.println("The Sum of "+(i+1)+" row is : "+rowSum);
		}
	}
	
	public void showColSum(int a[][])
	{
		System.out.println("**************************************");
		int temp[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			int colSum = 0;
			for(int j=0;j<a[i].length;j++)
			{
				temp[i][j] = a[j][i];
				colSum += temp[i][j];
				//System.out.print(temp[i][j]+" ");
			}
			System.out.println("The addition of "+(i+1)+" column is : "+colSum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("Enter array elements : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		Assignment4 o = new Assignment4();
		o.showSumRow(a);
		o.showColSum(a);
		sc.close();
	}
}
